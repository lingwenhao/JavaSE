package action.iterator.iterator_c;

import java.util.ArrayList;
import java.util.List;

public class ListStructure implements Structure{
    private List<String> list;

    public ListStructure() {
        this.list = new ArrayList<String>();
        addElement("list1.....");
        addElement("list2.....");
        addElement("list3.....");
        addElement("list4.....");
    }

    @Override
    public String getName() {
        return "List集合";
    }

    @Override
    public void addElement(String string) {
        list.add(string);
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator{
        private int position = -1;
        @Override
        public boolean hasNext() {
            if(position >= list.size()-1){
                return false;
            }else {
                position++;
                return true;
            }
        }

        @Override
        public Object next() {
            return list.get(position);
        }

        @Override
        public boolean remove() {
            return false;
        }
    }
}
