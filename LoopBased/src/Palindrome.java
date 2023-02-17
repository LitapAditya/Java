public class Palindrome
{
    public boolean isPalindrome(int receivedNumber)
    {
        int reverseOfReceivedNumber = 0;
        for (int i = receivedNumber; i != 0; i /= 10)
        {
            reverseOfReceivedNumber = reverseOfReceivedNumber * 10 + (i % 10);
        }
        return receivedNumber == reverseOfReceivedNumber;
    }
}
