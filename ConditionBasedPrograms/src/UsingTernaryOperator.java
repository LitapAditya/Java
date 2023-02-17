public class UsingTernaryOperator
{
    public String byteConversion(int byteFormat, int byteValue)
    {
        return (byteFormat == 0) ? "VALUE IN MB IS: " + (byteValue / 1000) : "VALUE IN KB IS: " + (byteValue * 1000);
    }

    public String equalSum(double numberOne,double numberTwo,double numberThree)
    {
        return (numberOne + numberTwo == numberThree) ? "SUM IS EQUAL" : "SUM IS NOT EQUAL";
    }

    public String kilometerToMiles(double kilometersPerHour)
    {
        return (kilometersPerHour < 0) ? "INVALID INPUT" : "VELOCITY IN MILES PER HOUR: " + Math.round(0.6213711922f * kilometersPerHour);
    }

    public String leapYear(int enteredYear)
    {
        return (enteredYear % 4 == 0) ? ((enteredYear % 100 == 0 && enteredYear % 400 != 0) ? "ENTERED YEAR IS NOT A LEAP YEAR" : "ENTERED YEAR IS A LEAP YEAR") : "ENTERED YEAR IS NOT A LEAP YEAR";
    }

    public String equalDecimals(double decimalOne, double decimalTwo)
    {
        return ((int)(decimalOne * 1000) == (int)(decimalTwo * 1000)) ? "TRUE" : "FALSE";
    }

    public String parameterCheck(double parameter)
    {
        return (parameter > 0) ? ((parameter == 0) ? "ZERO" : "POSITIVE") : "NEGATIVE";
    }
}
