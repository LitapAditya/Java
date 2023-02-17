import java.util.Scanner;

public class EqualSum
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THREE NUMBERS");
        Scanner scanner = new Scanner(System.in);
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();
        double numberThree = scanner.nextDouble();

        if (numberOne + numberTwo == numberThree)
            System.out.println("SUM IS EQUAL");

        else
            System.out.println("SUM IS NOT EQUAL");
    }
}
