public class Permutations
{
    static String printed = "";
    public void getPermutations(String givenString)
    {
        int givenStringLength = givenString.length();
        String formerString = "";
        permutations(formerString, givenString, givenStringLength);
    }

    private void permutations(String formerString, String latterString, int givenStringLength)
    {
        if (givenStringLength > 1)
        {
            for (int i = 0; i < givenStringLength; i++)
            {
                String modifiedFormerString = formerString.concat(latterString.substring(0, 1));
                String modifiedLatterString = latterString.substring(1);
                int modifiedGivenStringLength = modifiedLatterString.length();

                permutations(modifiedFormerString, modifiedLatterString, modifiedGivenStringLength);

                System.out.println(modifiedFormerString.concat(modifiedLatterString));

                latterString = rotate(latterString);
            }
        }
    }

    private String rotate(String latterString)
    {
        String initialCharacter = latterString.substring(0, 1);
        return latterString.substring(1).concat(initialCharacter);
    }
}