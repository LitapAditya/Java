public class Main
{
    public static void main(String[] args)
    {
        String stringONe = """
                     * The value is used for character storage.
                     * @implNote This field is trusted by the VM, and is a subject to
                     * constant folding if String instance is constant. Overwriting this
                     * field after construction will cause problems.
                     * Additionally, it is marked with {@link Stable} to trust the contents
                     * of the array. No other facility in JDK provides this functionality (yet).
                     * {@link Stable} is safe here, because value is never null.
                """;
        stringONe = stringONe.toLowerCase();
        String stringTwo = "is";
        int count = 0;

        for (int i = 0; i < stringONe.length(); i++)
        {
            if (stringONe.startsWith(" " + stringTwo + " ", i)
                    || stringONe.startsWith("\n" + stringTwo + " ", i)
                    || stringONe.startsWith(" " + stringTwo + "\n", i)
                    || stringONe.startsWith(" " + stringTwo + ".", i)
                    || stringONe.startsWith(" " + stringTwo + ",", i)
                    || stringONe.startsWith("" + stringTwo + " ", i) && i == 0)
            {
                i++;
                count++;
            }
        }
        System.out.println(count);
    }
}