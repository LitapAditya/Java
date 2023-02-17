import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER VELOCITY IN KMPH");
        Scanner scanner = new Scanner(System.in);
        double kilometersPerHour = scanner.nextDouble();
        VelocityConversion converter = new VelocityConversion();
        converter.printConversion(kilometersPerHour);
    }
}