package structure.adapter.adapter_g;

import java.lang.reflect.Parameter;
import java.util.*;

public class PropertiesUtils {

    /**
     *  不使用适配器模式
     */
//    public static void list(Structure collection){
//        if(collection instanceof List){
//            System.out.println("List......");
//        }else if(collection instanceof Set){
//            System.out.println("Set......");
//        }
//    }


    /**
     * 使用适配器模式
     *      注意:下面的方法相当于Client(客户端)
     * @param collection
     */
    public static void list(Collection collection){
        Disacher disacher = new Disacher();
        CollectionAdapter collectionAdapter = disacher.doDispatch(collection);
        collectionAdapter.handle(collection);
    }

    private interface CollectionAdapter{
        boolean support(Collection collection);
        void handle(Collection collection);
    }

    private static class ListAdapter implements CollectionAdapter{

        @Override
        public boolean support(Collection collection) {
            return (collection instanceof List);
        }

        @Override
        public void handle(Collection collection) {
            System.out.println("List:"+collection.getClass().getName());
        }
    }

    private static class SetAdapter implements CollectionAdapter{
        @Override
        public boolean support(Collection collection) {
            return (collection instanceof Set);
        }

        @Override
        public void handle(Collection collection) {
            System.out.println("Set:"+collection.getClass().getName());
        }
    }

    /**
     * 调度者
     */
    private static class Disacher {
        private List<CollectionAdapter> collectionAdapters = new ArrayList<>();

        public Disacher() {
            collectionAdapters.add(new ListAdapter());
            collectionAdapters.add(new SetAdapter());
        }

        public CollectionAdapter doDispatch(Collection collection){
            for(CollectionAdapter collectionAdapter:this.collectionAdapters ){
               if(collectionAdapter.support(collection)){
                   return collectionAdapter;
               }
            }
            return null;
        }
    }
}
