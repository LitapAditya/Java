import java.util.LinkedHashMap;
import java.util.Map;
public class Main
{
    public static void main(String[] args)
    {
        String str = "HELLO";
        char[] array = str.toCharArray();
        Map<Character, Integer> characterIntegerMap = new LinkedHashMap<>();
        for (char c : array)
        {
            characterIntegerMap.put(c,countLetter(array, c));
        }
        System.out.println(characterIntegerMap);
    }

    public static int countLetter(char[] array, char c)
    {
        int count = 0;
        for (char ch : array)
        {
            if (ch == c)
            {
                count++;
            }
        }
        return count;
    }
}