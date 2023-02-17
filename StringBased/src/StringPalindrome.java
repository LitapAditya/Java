public class StringPalindrome
{
    public boolean isPalindrome(String string)
    {
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder reverseStringBuilder = stringBuilder.reverse();
        String reversedString = new String(reverseStringBuilder);
        return string.equals(reversedString);
    }
}
