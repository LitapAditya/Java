import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        UsingTernaryOperator usingTernaryOperator = new UsingTernaryOperator();
        System.out.println("""
                ENTER THE FOLLOWING VALUES CONTINUOUSLY
                1.BYTE FORMAT
                2.BYTE VALUE
                3.NUMBER ONE
                4.NUMBER TWO
                5.NUMBER THREE
                6.KILOMETERS PER HOUR
                7.ENTERED YEAR
                8.DECIMAL ONE
                9.DECIMAL TWO
                10.PARAMETER""");
        int byteFormat = scanner.nextInt();
        int byteValue = scanner.nextInt();
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();
        double numberThree = scanner.nextDouble();
        double kilometersPerHour = scanner.nextDouble();
        int enteredYear = scanner.nextInt();
        double decimalOne = scanner.nextDouble();
        double decimalTwo = scanner.nextDouble();
        double parameter = scanner.nextDouble();

        String s1 = usingTernaryOperator.byteConversion(byteFormat, byteValue);
        String s2 = usingTernaryOperator.equalSum(numberOne, numberTwo, numberThree);
        String s3 = usingTernaryOperator.kilometerToMiles(kilometersPerHour);
        String s4 = usingTernaryOperator.leapYear(enteredYear);
        String s5 = usingTernaryOperator.equalDecimals(decimalOne, decimalTwo);
        String s6 = usingTernaryOperator.parameterCheck(parameter);

        System.out.println(s1);
    }
}