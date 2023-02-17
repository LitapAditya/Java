public class TeenNumber
{
    boolean hasTeen(int numberOne, int numberTwo, int numberThree)
    {
        return (numberOne >= 13 && numberOne <= 19) || (numberTwo >= 13 && numberTwo <= 19) || (numberThree >= 13 && numberThree <= 19);
    }
}