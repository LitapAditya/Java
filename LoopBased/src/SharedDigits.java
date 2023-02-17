public class SharedDigits
{
    public boolean hasSharedDigit(int numberOne, int numberTwo)
    {
        for (int i = numberOne; i != 0; i /= 10)
        {
            for (int j = numberTwo; j != 0; j /= 10)
            {
                if (i % 10 == j % 10)
                {
                    if (numberOne >= 10 && numberOne <= 99 && numberTwo >= 10 && numberTwo <= 99)
                        return true;
                }
            }
        }
        return false;
    }
}