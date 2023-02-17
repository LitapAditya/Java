public class EvenOrOdd
{
    public boolean isEvenOrOdd(int receivedNumber)
    {
        switch (receivedNumber % 2)
        {
            case 0 ->
            {
                return true;
            }
            default ->
            {
                return false;
            }
        }
    }

    public void ifIsEvenOrOdd(int receivedNumber)
    {
        if (receivedNumber % 2 == 0)
            System.out.println("NUMBER IS EVEN");
        else
            System.out.println("NUMBER IS ODD");
    }

    public boolean ternaryIsEvenOrOdd(int receivedNumber)
    {
        return receivedNumber % 2 == 0;
    }
}