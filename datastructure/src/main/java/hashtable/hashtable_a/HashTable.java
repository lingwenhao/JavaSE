package hashtable.hashtable_a;

/**
 * 哈希表
 * @author ronin
 */
public class HashTable {

    private EmployeeLinkedList[] employeeLinkedLists;
    private int size;

    /**
     * 初始化哈希表
     * @param size
     */
    public HashTable(int size) {
        this.employeeLinkedLists = new EmployeeLinkedList[size];
        this.size = size;
        for (int i = 0; i < employeeLinkedLists.length; i++) {
            employeeLinkedLists[i] = new EmployeeLinkedList();
        }
    }

    /**
     * 给哈希表中增加一个元素
     * @param employee
     */
    public void add(Employee employee){
        int index = hash(employee.getId());
        employeeLinkedLists[index].add(employee);
    }

    /**
     * 根据Employee的id计算出存放在具体的哪条链表中
     * @param id
     * @return
     */
    public int hash(int id){
       return id % size;
    }

    /**
     * 遍历哈希表
     */
    public void list(){
        for (int i = 0; i < size; i++) {
            employeeLinkedLists[i].list(i);
        }
    }

    /**
     * 根据id在哈希表中查找雇员
     * @param id
     */
    public void findEmployeeById(int id){
        Employee employee = employeeLinkedLists[hash(id)].getById(hash(id));
        if(null == employee){
            System.out.println("没有根据id:"+id+"在哈希表中查找到雇员......");
        }else {
            System.out.println("根据id:"+id+"在哈希表中查找到的雇员是:"+employee);
        }
    }

    /**
     * 根据id在哈希表中删除雇员
     * @param id
     */
    public void deleteEmployeeById(int id){
        EmployeeLinkedList employeeLinkedList = employeeLinkedLists[hash(id)];
        employeeLinkedList.deleteById(id);
    }
}

class Employee{
    private int id;
    private String name;
    protected Employee next;
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class EmployeeLinkedList{
    /**头指针，指向第一个Employee默认为null*/
    private Employee head;

    /**
     * 添加雇员到链表
     *  假定id是自增长，即id的分配总是从小到大,因此我们将雇员直接添加到本链表最后即可
     * @param employee
     */
    public void add(Employee employee){
        //如果是添加第一个雇员
        if(null == head){
            head = employee;
            return;
        }
        //如果不是添加第一个雇员，则使用一个辅助的指针，帮助定位到最后
        Employee currentEmployee = head;
        while(true){
            if(null == currentEmployee.next){
                break;
            }
            currentEmployee = currentEmployee.next;
        }
        if(currentEmployee.getId() < employee.getId()) {
            currentEmployee.next = employee;
        }
    }

    /**
     * 遍历链表
     */
    public void list(int no){
        if(null == head){
            System.out.println("当前链表"+(no+1)+"为空.....");
            return;
        }
        System.out.println("当前链表的信息为~:");
        //辅助指针
        Employee currentEmployee = head;
        while(true){
            System.out.println(currentEmployee);
            if(null == currentEmployee.next){
                break;
            }
            if(null !=currentEmployee.next){
                currentEmployee = currentEmployee.next;
            }
        }
    }

    /**
     * 根据输入的id查找对象
     * @param id
     * @return
     */
    public Employee getById(int id){
        if(null == head){
            System.out.println("链表为空.....");
            return null;
        }
        //辅助指针
        Employee currentEmployee = head;
        while (true) {
            if (currentEmployee.getId() == id) {
                break;
            }
            if(null == currentEmployee.next){
                currentEmployee = null;
                break;
            }
            currentEmployee = currentEmployee.next;
        }
        return currentEmployee;

    }


    /**
     * 根据输入的id删除对象
     * @param id
     * @return
     */
    public void deleteById(int id){
        if(null == head){
            System.out.println("链表为空.....");
        }
        //辅助指针
        Employee currentEmployee = head;
        Employee previewEmployee = head;
        while (true) {
            if (head.getId() == id) {
                head = null;
                break;
            }
            if (currentEmployee.getId() == id) {
                previewEmployee.next = null;
                break;
            }
            if(null == currentEmployee.next){
                System.out.println("链表中没有该元素.....");
                break;
            }
            previewEmployee = currentEmployee;
            currentEmployee = currentEmployee.next;
        }

    }
}

