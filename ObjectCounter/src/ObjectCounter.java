public class ObjectCounter
{
    private static int counter;

    public ObjectCounter()
    {
        counter++;
    }
    public static int getCounter()
    {
        return counter;
    }
}