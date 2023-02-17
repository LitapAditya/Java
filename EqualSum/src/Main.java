import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THREE INTEGERS");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int numberThree = scanner.nextInt();
        EqualSum checker = new EqualSum();
        System.out.println(checker.hasEqualSum(numberOne, numberTwo, numberThree));
    }
}