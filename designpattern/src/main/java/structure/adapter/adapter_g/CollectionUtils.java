package structure.adapter.adapter_g;

import java.util.*;

public class CollectionUtils {

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
        Dispatacher dispatacher = new Dispatacher();
        CollectionAdapter collectionAdapter = dispatacher.doDispatch(collection);
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
            List list = new ArrayList<>(collection);
            Iterator iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next().toString());
            }
        }
    }

    private static class SetAdapter implements CollectionAdapter{
        @Override
        public boolean support(Collection collection) {
            return (collection instanceof Set);
        }

        @Override
        public void handle(Collection collection) {
            Set set = new HashSet<>(collection);
            Iterator iterator = set.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }

    /**
     * 调度者
     */
    private static class Dispatacher {

        private List<CollectionAdapter> collectionAdapters = new ArrayList<>();

        public Dispatacher() {
            collectionAdapters.add(new ListAdapter());
            collectionAdapters.add(new SetAdapter());
        }

        /**
         *
         * @param collection
         * @return
         */
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
