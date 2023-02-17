public class Main
{
    public static void main(String[] args)
    {
        Person personOne = new Person("GORDON FREEMAN", 27, "BLACK MESA");
        Person personTwo = new Person("GORDON FREEMAN", 27, "BLACK MESA");


//        if (personOne == personTwo)
//            System.out.println("SAME");
//
//        else
//            System.out.println("NOT SAME");

        if (personOne.equals(personTwo))
        {
            System.out.println("EQUAL");
        }

        else
        {
            System.out.println("NOT EQUAL");
        }
    }
}