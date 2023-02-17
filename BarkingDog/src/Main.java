import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER 'true' IF THE DOG IS BARKING AND 'false' IF IT IS NOT");
        boolean barking = scanner.nextBoolean();
        System.out.println("ENTER THE HOUR OF THE DAY");
        int hourOfDay = scanner.nextInt();
        BarkingDog wakeUpCaller = new BarkingDog();
        System.out.println(wakeUpCaller.shouldWakeUp(barking, hourOfDay));
    }
}