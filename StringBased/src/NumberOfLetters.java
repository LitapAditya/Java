public class NumberOfLetters extends CharacterCount
{
    public void getLetterCount(String string)
    {
        string = string.toLowerCase();
        StringBuilder uniqueLetterString = new StringBuilder();

        for (int i = 0; i < string.length(); i++)
        {
            int count = 0;
            if (!(isRepeated(uniqueLetterString, string.charAt(i))))
            {
                count = getCharacterCount(string,string.charAt(i));
                uniqueLetterString.append(string.charAt(i));
                System.out.print(string.charAt(i) + "->" + count + " ");
            }
        }
    }

    private boolean isRepeated(StringBuilder uniqueLetterString, char indexCharacter)
    {
        int isRepeatedFlag = 0;

        for (int i = 0; i < uniqueLetterString.length(); i++)
        {
            if (uniqueLetterString.charAt(i) == indexCharacter)
            {
                isRepeatedFlag = 1;
                break;
            }
        }

        return isRepeatedFlag == 1;
    }
}
