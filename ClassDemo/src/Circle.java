public class Circle
{
    double area(double radius)
    {
        double piValue = 3.14;
        double area = piValue * radius * radius;
        return area;
    }

    double circumference(double radius)
    {
        double piValue = 3.14;
        double circumference = 2 * piValue * radius;
        return circumference;
    }
}
