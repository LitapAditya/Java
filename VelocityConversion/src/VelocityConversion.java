public class VelocityConversion
{
    long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour < 0)
            return -1;

        else
        {
            return Math.round(0.621371 * kilometersPerHour);
        }
    }

    void printConversion(double kilometersPerHour)
    {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        if (milesPerHour == -1)
            System.out.println("INVALID VALUE");

        else
        {
            System.out.println(kilometersPerHour + " KM/HR = " + milesPerHour + " MI/HR");
        }
    }
}