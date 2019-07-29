package structure.staticproxy.staticproxy_b;

public class TeacherDao implements ITeacher{
    @Override
    public void teach() {
        System.out.println("教书......");
    }
}
