import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int result = 0;
        try
        {
            result = division();
        }

        catch (ArithmeticException e)
        {
            System.out.println("CANNOT DIVIDE BY 0");
        }
        System.out.println("RESULT: " + result);
    }

    public static int division()
    {
        int result = 0;
        try
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("ENTER VALUE ONE");
            int a = scanner.nextInt();
            System.out.println("ENTER VALUE TWO");
            int b = scanner.nextInt();
            result = a / b;
            throw new ArithmeticException();
        }

//        catch (ArithmeticException | InputMismatchException e)
//        {
//            System.out.println("NUMBER CANNOT BE DIVIDED BY 0");
//            System.out.println("AN EXCEPTION HAS OCCURRED");
//        }

        catch (InputMismatchException e)
        {
            System.out.println("INVALID INPUT");
        }

        return result;
    }
}