package structure.staticproxy.staticproxy_b;

public class TeacherDaoProxy  implements ITeacher{
    private ITeacher teacherDao;

    public TeacherDaoProxy(ITeacher teacherDao) {
        this.teacherDao = teacherDao;
    }

    @Override
    public void teach() {
        System.out.println("代理开始......");
        teacherDao.teach();
        System.out.println("代理结束......");
    }
}
