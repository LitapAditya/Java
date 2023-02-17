public class CharacterCount
{
    public int getCharacterCount(String string, char character)
    {
        int count = 0;

        for (int i = 0; i < string.length(); i++)
        {
            if (string.charAt(i) == character)
            {
                count++;
            }
        }

        return count;
    }
}
