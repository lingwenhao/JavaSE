package action.iterator.iterator_b;

import java.util.List;

public class OutputImpl {
    //学院集合
    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    //学院输出系
    public void printDepartment(Iterator iterator){
        while(iterator.hasNext()){
            Department department = (Department)iterator.next();
            System.out.println(department.getName()+":"+department.getDesc());
        }
    }

    /**
     * 遍历所有的学院,调用printDepartment输出系
     */
    public void printCollege(){
        for(College college:collegeList){
            System.out.println("----------------"+college.getName()+"----------------");
            //得到对应的迭代器
            printDepartment(college.ceateIterator());
        }
    }
}
