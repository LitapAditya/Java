public class SumOfFirstAndLastDigit
{
    public int sumOfFirstAndLastDigits(int receivedNumber)
    {
        int firstDigit = 0;
        for (int i = receivedNumber; i != 0; i /= 10)
        {
            firstDigit = i;
        }
        int lastDigit = receivedNumber % 10;
        return firstDigit + lastDigit;
    }
}
