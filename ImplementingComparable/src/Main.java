import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee("ZEN", 22);
        Employee employee2 = new Employee("GOLAF", 24);
        Employee employee3 = new Employee("LINDER", 26);
        Employee employee4 = new Employee("PINTALA", 28);
        Employee employee5 = new Employee("FALACHBASH", 30);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        System.out.println(employeeList);

        Collections.sort(employeeList, new Employee("abc",20));

        System.out.println("#".repeat(175));

        System.out.println(employeeList);
    }
}