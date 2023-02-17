import java.util.Scanner;

public class ParameterCheck
{
    public static void main(String[] args)
    {
        System.out.println("ENTER ANY NUMBER");
        Scanner scannedVariableReference = new Scanner(System.in);
        double parameter = scannedVariableReference.nextDouble();

        if (parameter > 0)
        {
            System.out.println("POSITIVE");
        } else if (parameter < 0)
        {
            System.out.println("NEGATIVE");
        } else
        {
            System.out.println("ZERO");
        }
    }
}
