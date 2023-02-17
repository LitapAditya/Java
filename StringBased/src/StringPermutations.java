public class StringPermutations
{

    public void getStringPermutations(String string)
    {
        StringBuilder stringBuilder = new StringBuilder(string);
        StringBuilder str1 = new StringBuilder(string.substring(0, 0));
        StringBuilder str2 = new StringBuilder(string.substring(1));
        String stringStr2 = new String(str2);
        rotate(stringStr2);

    }

    public String rotate(String string)
    {
//        if (string.length() > 1)
//        {
//            StringBuilder subStringBuilder = new StringBuilder(string.substring(1));
//            String subString = new String(subStringBuilder);
//
//            rotate(subString, stringLength);

        StringBuilder stringBuilder = new StringBuilder(string);

        char temp = stringBuilder.charAt(0);

        for (int i = 0; i < stringBuilder.length() - 1; i++)
        {
            stringBuilder.setCharAt(i, stringBuilder.charAt(i + 1));
            StringBuilder stringBuilder1;
            stringBuilder1 = new StringBuilder(stringBuilder.substring(1));
            String string2 = new String(stringBuilder1);
        }

        stringBuilder.setCharAt(stringBuilder.length() - 1, temp);

        String finalString = new String(stringBuilder);
        return finalString;
//            System.out.println(stringBuilder);
//        }
//    }

    }
}