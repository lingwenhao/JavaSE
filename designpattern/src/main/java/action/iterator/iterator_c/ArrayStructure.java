package action.iterator.iterator_c;


public class ArrayStructure implements Structure {
    private String[] strings;
    private int position;

    public ArrayStructure() {
        strings = new String[4];
        addElement("array1......");
        addElement("array2......");
        addElement("array3......");
        addElement("array4......");
    }

    @Override
    public String getName() {
        return "Set集合";
    }

    @Override
    public void addElement(String string) {
        strings[position] = string;
        position++;
    }

    @Override
    public Iterator iterator() {
        return new ArrayIterator();
    }

    private class ArrayIterator implements Iterator{
        private int innerPosition = -1;
        @Override
        public boolean hasNext() {
            if(innerPosition >= strings.length - 1){
                return false;
            }else {
                innerPosition++;
                return true;
            }
        }

        @Override
        public Object next() {
            return strings[innerPosition];
        }

        @Override
        public boolean remove() {
            return false;
        }
    }
}
