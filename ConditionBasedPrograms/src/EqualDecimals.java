import java.util.Scanner;

public class EqualDecimals
{
    public static void main(String[] args)
    {
        System.out.println("ENTER TWO DECIMAL NUMBERS");
        Scanner scanner = new Scanner(System.in);
        double decimalOne = scanner.nextDouble();
        double decimalTwo = scanner.nextDouble();

        if ((int)(decimalOne * 1000) == (int)(decimalTwo * 1000))
            System.out.println("TRUE");

        else
            System.out.println("FALSE");
    }
}
