public class StringAnagram
{
    public boolean areAnagrams(String string, String string1)
    {
        StringBuilder stringBuilderTwo = new StringBuilder(string1);
        StringBuilder reverseStringBuilderTwo = stringBuilderTwo.reverse();
        String reversedString1 = new String(reverseStringBuilderTwo);
        return string.equals(reversedString1);
    }
}
