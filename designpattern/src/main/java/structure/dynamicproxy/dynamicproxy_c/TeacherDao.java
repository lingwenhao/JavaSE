package structure.dynamicproxy.dynamicproxy_c;

public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("授课中......");
    }

    @Override
    public String sayello(String name) {
        System.out.println(name);
        return name;
    }
}
