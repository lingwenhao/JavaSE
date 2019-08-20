package action.iterator.iterator_b;

/**
 * 计算机学院:元素存放在数组中
 */
public class ComputerCollegeIterator implements Iterator{
    //这里我们需要知道Departemnt是以怎样的形式存储
    private Department[] departments;
    private int position;

    public ComputerCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        //判断是否有下一个元素
        if(position >= departments.length || departments[position] == null) {
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position++;
        return department;
    }

    @Override
    public boolean remove() {
        return false;
    }
}
