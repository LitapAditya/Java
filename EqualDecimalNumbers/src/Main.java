import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER TWO DECIMAL NUMBERS");
        Scanner scanner = new Scanner(System.in);
        double decimalNumberOne = scanner.nextDouble();
        double decimalNumberTwo = scanner.nextDouble();
        EqualDecimalNumbers checker = new EqualDecimalNumbers();
        System.out.println(checker.areEqualByThreeDecimalPlaces(decimalNumberOne, decimalNumberTwo));
    }
}