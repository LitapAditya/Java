import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
//        String string = "BLACK MESA RESEARCH FACILITY";
//        char[] stringArray = new char[string.length()];
//
//        for (int i = 0; i < stringArray.length; i++)
//        {
//            stringArray[i] = string.charAt(i);
//        }
//
//        System.out.println(stringArray);
//
//        for (char c : stringArray)
//        {
//            System.out.println(c);
//        }

//        String string = "BLACK MESA";
//        char[] stringArray = string.toCharArray();
//
//        for (char c : stringArray)
//        {
//            System.out.println(c);
//        }

        String[] stringArray = new String[] {"ONE", "TWO", "THREE"};
//        List<String> arrayList = Arrays.asList(stringArray);
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(stringArray));
    }
}