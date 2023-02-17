public class Main
{
    public static void main(String[] args)
    {
        double radius = 10;
        Circle object = new Circle();
        double area = object.area(radius);
        double circumference = object.circumference(radius);
        System.out.println(area);
        System.out.println(circumference);
    }
}