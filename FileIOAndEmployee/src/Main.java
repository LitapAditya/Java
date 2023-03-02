import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee employee1 = new Employee("EMPLOYEE1",21);
        Employee employee2 = new Employee("EMPLOYEE2",22);
        Employee employee3 = new Employee("EMPLOYEE3",23);
        Employee employee4 = new Employee("EMPLOYEE4",24);
        Employee employee5 = new Employee("EMPLOYEE5",25);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        WriteOperation writeOperation = new WriteOperation();
        writeOperation.writeListFile(employeeList);

        ReadOperation readOperation = new ReadOperation();
        readOperation.readListFile();
    }
}