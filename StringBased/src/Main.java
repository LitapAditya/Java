import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

//        StringPermutations stringPermutations = new StringPermutations();
//        System.out.println("ENTER A WORD");
//        String string = scanner.nextLine();
//        stringPermutations.getStringPermutations(string);
//
//        StringAnagram stringAnagram = new StringAnagram();
//        String string = scanner.nextLine();
//        String string1 = scanner.nextLine();
//        System.out.println(stringAnagram.areAnagrams(string, string1));
//
//        StringPalindrome stringPalindrome = new StringPalindrome();
//        String string = scanner.nextLine();
//        System.out.println(stringPalindrome.isPalindrome(string));
//
//        CharacterCount characterCount = new CharacterCount();
//        String string = scanner.nextLine();
//        char character = scanner.next().charAt(0);
//        System.out.println(characterCount.getCharacterCount(string, character));
//
        NumberOfLetters numberOfLetters = new NumberOfLetters();
        String string;
        string = scanner.nextLine();
        numberOfLetters.getLetterCount(string);
//
//        StringPermutations stringPermutations = new StringPermutations();
//        stringPermutations.rotate("abc");
    }
}