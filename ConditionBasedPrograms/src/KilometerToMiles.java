import java.util.Scanner;

public class KilometerToMiles
{
    public static void main(String[] args)
    {
        System.out.println("ENTER VELOCITY IN KMPH");
        Scanner scanner = new Scanner(System.in);
        double kilometersPerHour = scanner.nextFloat();

        if (kilometersPerHour < 0)
        {
            System.out.println("INVALID INPUT");
        } else
        {
            double conversionValue = (0.6213711922f * kilometersPerHour); //CAN'T WRITE 'f' OUTSIDE BRACKET AS SUFFIXES ARE PUT AFTER HARDCODED VALUES AND NOT AFTER VARIABLES BECAUSE THEIR DATA TYPE IS CONSIDERED SO HAS TO HAVE TYPE CASTE
            double milesPerHour = Math.round(conversionValue);
            System.out.println("VELOCITY IN MILES PER HOUR: " + milesPerHour);
        }
    }
}
