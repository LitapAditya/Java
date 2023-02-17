public class VowelsAndConsonants
{
    public boolean isVowelOrConsonant(char receivedLetter)
    {
        switch (receivedLetter)
        {
            case 'a','e','i','o','u','A','E','I','O','U':
                return true;
            default:
                return false;
        }
    }

    public String ifIsVowelOrConsonant(char receivedLetter)
    {
        if (receivedLetter == 'a' || receivedLetter == 'i' || receivedLetter == 'o' || receivedLetter == 'u' || receivedLetter == 'A' || receivedLetter == 'E' || receivedLetter == 'I' || receivedLetter == 'O' || receivedLetter == 'U')
            return "You have entered Vowel." + receivedLetter + "is a Vowel.";
        else
            return "You have entered Consonant." + receivedLetter + " is a Consonant.";
    }
}