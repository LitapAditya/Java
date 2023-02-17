public class Main
{
    public static void main(String[] args)
    {
        Singleton singleton = Singleton.getObject();
        Singleton singleton1 = Singleton.getObject();

        System.out.println(singleton.toString());
        System.out.println(singleton1.toString());
    }
}