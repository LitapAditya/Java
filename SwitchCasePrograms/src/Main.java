import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


//        System.out.println("ENTER A NUMBER FROM 1 TO 7");
//        int enteredNumber = scanner.nextInt();
//        DayOfWeek dayOfWeekCaller = new DayOfWeek();
//        dayOfWeekCaller.dayAtThatNumber(enteredNumber);
//
//
//        System.out.println("ENTER THE NUMBER OF A MONTH i.e. FROM 1 TO 12");
//        int enteredMonthNumber = scanner.nextInt();
//        NumberOfDaysInAMonth numberOfDaysInAMonthCaller = new NumberOfDaysInAMonth();
//        numberOfDaysInAMonthCaller.numberOfDaysInAMonth(enteredMonthNumber);
//
//
//        System.out.println("ENTER AN ALPHABET");
//        char enteredAlphabet = scanner.next().charAt(0);
//        VowelsAndConsonants vowelsAndConsonants = new VowelsAndConsonants();
//        if (vowelsAndConsonants.isVowelOrConsonant(enteredAlphabet))
//            System.out.println("YOU HAVE ENTERED A VOWEL.'" + enteredAlphabet +  "' IS A VOWEL");
//        else
//            System.out.println("YOU HAVE ENTERED A CONSONANT.'" + enteredAlphabet + "' IS A VOWEL");


        System.out.println("ENTER TWO NUMBERS");
        double valueOne = scanner.nextDouble();
        double valueTwo = scanner.nextDouble();
        System.out.println("""
                CHOOSE ONE OF THE FOLLOWING OPERATIONS FOR THE ENTERED NUMBERS:
                1.ADDITION
                2.SUBTRACTION
                3.MULTIPLICATION
                4.DIVISION
                5.MODULUS""");
        int chosenCalculation = scanner.nextInt();
        Calculator calculator = new Calculator();
        calculator.ternaryCalculation(chosenCalculation, valueOne, valueTwo);


//        System.out.println("ENTER AN INTEGER");
//        int enteredValue = scanner.nextInt();
//        EvenOrOdd evenOrOdd = new EvenOrOdd();
//        boolean isEven = evenOrOdd.isEvenOrOdd(enteredValue);
//        if (isEven)
//            System.out.println("NUMBER IS EVEN");
//        else
//            System.out.println("NUMBER IS ODD");
    }
}