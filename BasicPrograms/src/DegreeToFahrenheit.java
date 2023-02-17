import java.util.Scanner;

public class DegreeToFahrenheit
{
    public static void main(String[] args)
    {
        double temperatureInDegree;
        double temperatureInFahrenheit;
        System.out.println("ENTER THE TEMPERATURE IN DEGREE CELSIUS");
        Scanner sVariable = new Scanner(System.in);
        temperatureInDegree = sVariable.nextInt();
        temperatureInFahrenheit = (9.0 / 5 * temperatureInDegree) + 32;
        System.out.println("TEMPERATURE IN FAHRENHEIT: " + temperatureInFahrenheit);
    }
}
