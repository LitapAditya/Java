public class Main
{
    public static void main(String[] args)
    {
        String name = "GUEST BEDROOM";
        Wall wall1 = new Wall("WEST");
        Wall wall2 = new Wall("SOUTH");
        Wall wall3 = new Wall("EAST");
        Wall wall4 = new Wall("NORTH");
        Ceiling ceiling = new Ceiling(5, 1);
        Bed bed = new Bed("SINGLE", 2, 2, 1, 1);
        Lamp lamp = new Lamp("TABLE", false, 10);

        Bedroom bedroom = new Bedroom(name, wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();
    }
}