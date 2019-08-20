package action.iterator.iterator_b;

import java.util.List;

/**
 * 信息工程学院:元素存放在集合中
 */
public class InformationCollegeIterator implements Iterator{
    private List<Department> departments;
    private int index = -1;

    public InformationCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index >= departments.size() -1 ){
            return false;
        }else {
            index++;
            return true;
        }
    }

    @Override
    public Object next() {
        return departments.get(index);
    }

    @Override
    public boolean remove() {
        return false;
    }

}