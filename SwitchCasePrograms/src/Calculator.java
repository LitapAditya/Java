public class Calculator
{
    public void calculateValue(int chosenCalculation, double valueOne, double valueTwo)
    {
        switch (chosenCalculation)
        {
            case 1 ->
            {
                System.out.println("ADDITION: " + additionCalculation(valueOne, valueTwo));
            }

            case 2 ->
            {
                System.out.println("SUBTRACTION: " + subtractionCalculation(valueOne, valueTwo));
            }

            case 3 ->
            {
                System.out.println("MULTIPLICATION: " + multiplicationCalculation(valueOne, valueTwo));
            }

            case 4 ->
            {
                System.out.println("DIVISION: " + divisionCalculation(valueOne, valueTwo));
            }

            case 5 ->
            {
                System.out.println("MODULUS: " + modCalculation(valueOne, valueTwo));
            }

            default ->
            {
                System.out.println("INVALID CHOICE");
            }
        }
    }

    public double additionCalculation(double valueOne, double valueTwo)
    {
        return valueOne + valueTwo;
    }

    public double subtractionCalculation(double valueOne, double valueTwo)
    {
        return valueOne - valueTwo;
    }

    public double multiplicationCalculation(double valueOne, double valueTwo)
    {
        return valueOne * valueTwo;
    }

    public double divisionCalculation(double valueOne, double valueTwo)
    {
        return valueOne / valueTwo;
    }

    public double modCalculation(double valueOne, double valueTwo)
    {
        return valueOne % valueTwo;
    }

    public double ifCalculation(int chosenCalculation, double valueOne, double valueTwo)
    {
        if (chosenCalculation == 1)
            return valueOne + valueTwo;

        else if (chosenCalculation == 2)
            return valueOne - valueTwo;

        else if (chosenCalculation == 3)
            return valueOne * valueTwo;

        else if (chosenCalculation == 4)
            return valueOne / valueTwo;

        else if (chosenCalculation == 5)
            return valueOne % valueTwo;

        else
            return 0;
    }

    public double ternaryCalculation(int chosenCalculation, double valueOne, double valueTwo)
    {
        return (chosenCalculation >= 3) ? ((chosenCalculation > 3) ? ((chosenCalculation == 4) ? divisionCalculation(valueOne, valueTwo) : modCalculation(valueOne, valueTwo)) : multiplicationCalculation(valueOne, valueTwo)) : (chosenCalculation == 2) ? subtractionCalculation(valueOne, valueTwo) : additionCalculation(valueOne, valueTwo);
    }
}
