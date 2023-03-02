import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteOperation {
    public void writeListFile(List<Employee> employeeList) {

        FileWriter fileWriter = null;

        try {

            fileWriter = new FileWriter("Employee Details.txt");
            for (Employee e : employeeList) {

                fileWriter.write(e.getName() + " " + e.getAge() + "\n");
            }

        }catch (IOException e) {

            System.out.println("FILE NOT FOUND");

        }finally {

            try {

                if (fileWriter != null)
                    fileWriter.close();

            }catch (IOException e) {

                System.out.println("FILE NOT FOUND");

            }
        }
    }
}