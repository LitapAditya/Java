import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("EMPLOYEE1", 21, 1, "DESIGNATION1");
        Employee employee2 = new Employee("EMPLOYEE2", 22, 2, "DESIGNATION2");
        Employee employee3 = new Employee("EMPLOYEE3", 23, 3, "DESIGNATION3");

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        System.out.println(employeeList);

        System.out.println("#".repeat(100));

        Collections.sort(employeeList);
    }
}