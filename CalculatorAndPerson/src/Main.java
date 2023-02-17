public class Main
{
    public static void main(String[] args)
    {
//        SimpleCalculator simpleCalculator = new SimpleCalculator();
//        simpleCalculator.setFirstNumber(25);
//        simpleCalculator.setSecondNumber(10);
//        System.out.println("ADDITION: " + simpleCalculator.getAdditionResult());
//        System.out.println("SUBTRACTION: " + simpleCalculator.getSubtractionResult());
//        System.out.println("MULTIPLICATION: " + simpleCalculator.getMultiplicationResult());
//        System.out.println("DIVISION: " + simpleCalculator.getDivisionResult());

        Person person = new Person();
        person.setAge(15);
        System.out.println(person.isTeen() ? "PERSON IS A TEEN" : "PERSON IS NOT A TEEN");
//        person.setFirstName("GORDON");
        person.setLastName("FREEMAN");
        System.out.println(person.getFullName());
    }
}