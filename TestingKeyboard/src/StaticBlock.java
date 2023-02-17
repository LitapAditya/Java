public class StaticBlock
{
    private static int number;
    private String name;
    private int age;

    public StaticBlock(String name, int age)
    {
        System.out.println("CONSTRUCTOR CALLED");
        this.name = name;
        this.age = age;
    }

    static
    {
        System.out.println("STATIC BLOCK");
    }

    static
    {
        System.out.println("STATIC BLOCK 2");
    }

    {
        System.out.println("INSTANCE BLOCK");
    }

    {
        System.out.println("INSTANCE BLOCK 2");
    }
}
