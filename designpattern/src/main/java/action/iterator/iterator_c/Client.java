package action.iterator.iterator_c;

/**
 * 对于List和Array两种不同的结构,可以使用相同的方式来遍历
 */
public class Client {
    public static void main(String[] args) {
        /**
         * 遍历list结构
         */
        Structure listStructure = new ListStructure();
        Iterator listiIterator = listStructure.iterator();
        while (listiIterator.hasNext()){
            System.out.println(listiIterator.next());
        }

        System.out.println("------------------");
        /**
         * 遍历Array结构
         */
        Structure arrayStructure = new ArrayStructure();
        Iterator arrayIterator = arrayStructure.iterator();
        while (arrayIterator.hasNext()){
            System.out.println(arrayIterator.next());
        }
    }
}
