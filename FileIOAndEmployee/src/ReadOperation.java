import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadOperation {
    public void readListFile() {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("Employee Details.txt"));
            while (scanner.hasNextLine()) {

                String[] strings = scanner.nextLine().split(" ");
                employeeArrayList.add(new Employee(strings[0], Integer.parseInt(strings[1])));
            }

        }catch (IOException e) {
            System.out.println("FILE NOT FOUND");
        }finally {
            if (scanner != null)
                scanner.close();
        }
        System.out.println(employeeArrayList);
    }
}