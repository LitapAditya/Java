public class Triangle
{
    boolean isTriangle(int angleOne, int angleTwo, int angleThree)
    {
        return (angleOne + angleTwo + angleThree == 180);
    }

    void printValidation(int angleOne, int angleTwo, int angleThree)
    {
        if (isTriangle(angleOne, angleTwo, angleThree))
            System.out.println("TRIANGLE IS VALID");

         else
            System.out.println("TRIANGLE IS INVALID");
    }
}