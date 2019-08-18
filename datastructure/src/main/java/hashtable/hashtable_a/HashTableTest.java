package hashtable.hashtable_a;

/**
 * @author ronin
 */
public class HashTableTest {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        Employee employee01 = new Employee(1,"张三");
        Employee employee02 = new Employee(3,"李四");
        Employee employee03 = new Employee(8,"王五");
        Employee employee04 = new Employee(9,"赵六");
        Employee employee11 = new Employee(11,"冯十");
        hashTable.add(employee01);
        hashTable.add(employee02);
        hashTable.add(employee03);
        hashTable.add(employee04);
        hashTable.add(employee11);
        hashTable.list();
        hashTable.findEmployeeById(1);
        hashTable.findEmployeeById(2);
        System.out.println("-------------------------------");
        hashTable.list();
        //删除元素
        //hashTable.deleteEmployeeById(1);
        hashTable.deleteEmployeeById(11);
        System.out.println("-------------------------------");
        hashTable.list();
    }
}
