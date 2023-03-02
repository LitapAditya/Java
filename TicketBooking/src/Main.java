import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Theatre theatre = new Theatre("PVR", 5, 6);
        boolean repeat = true;
        while (repeat)
        {
            System.out.println("""
                1.RESERVE
                2.CANCEL
                PRESS ANY OTHER KEY TO EXIT""");

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice)
            {
                case 1:
                    boolean isFound = theatre.reserve("E06");

                    if(isFound)
                    {
                        System.out.println("Seat reserved");
                    }

                    else
                    {
                        System.out.println("Already booked");
                    }
                    break;

                case 2:
                    theatre.cancelTicket("E06");
                    break;

                default:
                    repeat = false;
                    break;
            }
        }
    }
}