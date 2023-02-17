import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER A YEAR");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        LeapYear checkLeapYear = new LeapYear();
        System.out.println(checkLeapYear.isLeapYear(year));
    }
}