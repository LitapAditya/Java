import java.util.Scanner;

public class IsInsured
{
    public static void main(String[] args)
    {
        System.out.println("ENTER 'U' IF EMPLOYEE IS UNMARRIED AND 'M' IF EMPLOYEE IS MARRIED");
        Scanner scanner = new Scanner(System.in);
        char maritalStatus = scanner.next().charAt(0);
    }
}
