import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
//    public static void main(String[] args) {
//        try(Person person = new Person()) {
//
//        }catch (IOException e) {
//
//        }
//    }

    public static void main(String[] args) {
        char[] array = new char[5];
        try (FileWriter fileWriter = new FileWriter("TRY.txt")) {
            fileWriter.write("12345");
        } catch (IOException e) {
            System.out.println("IOException");
        }

        try (FileReader fileReader = new FileReader("TRY.txt")) {
            fileReader.read(array);
            System.out.println(Arrays.toString(array));
        } catch (IOException e) {
            System.out.println("IOException.txt");
        }
    }
}