public class Main
{
    public static void main(String[] args)
    {
        Wall wall = new Wall(20, 10);
        System.out.println("WALL AREA: " + wall.getArea());

        Point point = new Point(10, 20);
        Point another = new Point(15, 25);
        System.out.println("DISTANCE WITHOUT PARAMETERS: " + point.distance());
        System.out.println("DISTANCE WITH PARAMETERS: " + point.distance(20, 40));
        System.out.println("DISTANCE USING ANOTHER: " + point.distance(another));

        Floor floor = new Floor(10,20);
        System.out.println("FLOOR AREA: " + floor.getArea());
        Carpet carpet = new Carpet(100);
        System.out.println("COST: " + carpet.getCost());
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("TOTAL COST: " + calculator.getTotalCost());

        ComplexNumber complexNumber = new ComplexNumber(10, 20);
        ComplexNumber anotherComplexNumber = new ComplexNumber(15,25);
        complexNumber.add(10, 20);
        complexNumber.add(anotherComplexNumber);
        complexNumber.subtract(5, 15);
        complexNumber.subtract(anotherComplexNumber);
        System.out.println("FINAL REAL VALUE: " + complexNumber.getReal());
        System.out.println("FINAL IMAGINARY VALUE: " + complexNumber.getImaginary());
    }
}