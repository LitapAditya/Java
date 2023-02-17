public class BarkingDog
{
    boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        return barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));
    }
}