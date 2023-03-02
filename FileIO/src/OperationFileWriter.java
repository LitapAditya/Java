import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class OperationFileWriter
{
    public static void main(String[] args)
    {
        FileWriter fileWriter = null;
        try{
            fileWriter = new FileWriter("Sample.txt");
            fileWriter.write("WAKE UP MISTER FREEMAN");
            System.out.println("NO EXCEPTION TO HANDLE");
            throw new FileNotFoundException();
        }catch (IOException e){
            System.out.println("FILE NOT FOUND");
        }finally{
            System.out.println("FINALLY EXECUTED");
            try{
                if (fileWriter != null)
                    fileWriter.close();
            }catch (IOException e)
            {
                System.out.println("FILE NOT FOUND");
            }
        }
        System.out.println("END");
    }
}