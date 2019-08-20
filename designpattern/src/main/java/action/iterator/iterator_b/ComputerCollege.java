package action.iterator.iterator_b;

public class ComputerCollege implements College{

    private Department[] departments;
    //保存当前数组对象的个数
    int numOfDepartment = 0;

    public ComputerCollege() {
        departments = new Department[5];
        addDepartment("java","java专业");
        addDepartment("php","php专业");
        addDepartment("大数据","大数据专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name, desc);
        departments[numOfDepartment] = department;
        numOfDepartment++;
    }

    @Override
    public Iterator ceateIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
