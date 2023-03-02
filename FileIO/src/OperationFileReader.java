import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class OperationFileReader
{
    public static void main(String[] args)
    {
        FileReader fileReader = null;
        char[] array = new char[22];
        Scanner scanner = null;

        try
        {
            fileReader = new FileReader("Sample.txt");
            fileReader.read(array);
            System.out.println(Arrays.toString(array));
//            scanner = new Scanner(new FileReader("Sample.txt"));
//            System.out.println(scanner.nextLine());
            System.out.println("TRY ENDS HERE");
        }

        catch (IOException e)
        {
            System.out.println("FILE NOT FOUND");
        }

//        finally
        {
//            assert scanner != null;
//            scanner.close();
            try
            {
                fileReader.close();
            }

            catch (IOException e)
            {
                System.out.println("FILE NOT FOUND");
            }
        }
    }
}
