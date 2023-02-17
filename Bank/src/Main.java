import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true)
        {
            System.out.println("""
                CHOOSE ONE OF THE FOLLOWING TO PROCEED
                1.WITHDRAW
                2.DEPOSIT
                3.EXIT""");

            int option = scanner.nextInt();

            if (option == 1)
            {
                System.out.println("ENTER THE AMOUNT TO BE WITHDRAWN");
                int withdrawAmount = scanner.nextInt();
                bank.withdraw(withdrawAmount);
            }

            else if (option == 2)
            {
                System.out.println("ENTER THE MONEY TO BE DEPOSITED");
                int depositedAmount = scanner.nextInt();
                bank.deposit(depositedAmount);
            }

            else if (option == 3)
            {
                break;
            }

            else
            {
                System.out.println("INVALID INPUT");
            }
        }
    }
}