public class EqualDecimalNumbers
{
    boolean areEqualByThreeDecimalPlaces(double decimalNumberOne, double decimalNumberTwo)
    {
        return (Math.round(decimalNumberOne * 1000) == Math.round(decimalNumberTwo * 1000));
    }
}
