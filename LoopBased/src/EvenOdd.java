public class EvenOdd
{
    public int oddSum(int limit)
    {
        int oddSum = 0;
        for (int i=1; i <= limit; i++)
        {
            if (i % 2 != 0)
                oddSum += i;
        }
        return oddSum;
    }

    public int evenSum(int limit)
    {
        int evenSum = 0;
        {
            for (int i=1; i <= limit; i++)
            {
                if (i % 2 == 0)
                    evenSum += i;
            }
        }
        return evenSum;
    }
}