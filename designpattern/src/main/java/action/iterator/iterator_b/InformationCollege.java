package action.iterator.iterator_b;

import java.util.ArrayList;
import java.util.List;

public class InformationCollege implements College {

    private List<Department> departments;

    public InformationCollege() {
        departments = new ArrayList<Department>();
        addDepartment("信息安全","信息安全专业");
        addDepartment("服务器","服务器安全专业");
        addDepartment("网络安全","网络安全专业");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        departments.add(new Department(name,desc));
    }

    @Override
    public Iterator ceateIterator() {
        return new InformationCollegeIterator(departments);
    }
}
