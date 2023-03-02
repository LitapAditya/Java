import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Computer computer1 = new Computer("MODEL3", "A" , 3001);
        Computer computer2 = new Computer("MODEL2", "B" , 3002);
        Computer computer3 = new Computer("MODEL1", "C" , 3003);

        Employee employee1 = new Employee("NAME1", 25, computer1);
        Employee employee2 = new Employee("NAME2", 26, computer2);
        Employee employee3 = new Employee("NAME3", 27, computer3);

        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(employee3);
        employeeList.add(employee2);
        employeeList.add(employee1);

        System.out.println(employeeList);
        System.out.println("#".repeat(175));
//        Collections.sort(employeeList);
        Collections.sort(employeeList, new CompareByType());
        System.out.println(employeeList);
    }
}