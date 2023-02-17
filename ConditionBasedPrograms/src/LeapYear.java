import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A YEAR");
        Scanner scanner = new Scanner(System.in);
        int enteredYear = scanner.nextInt();

        if (enteredYear % 4 == 0)
        {
            if (enteredYear % 100 == 0 && enteredYear % 400 != 0)
                System.out.println("ENTERED YEAR IS NOT A LEAP YEAR");

            else
                System.out.println("ENTERED YEAR IS A LEAP YEAR");
        }
    }
}
