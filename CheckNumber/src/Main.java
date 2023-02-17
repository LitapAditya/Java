import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER AN INTEGER");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        CheckNumber isNumber = new CheckNumber();
        isNumber.checkNumber(number);
    }
}