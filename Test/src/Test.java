public class Test
{
//    Test(int a, int b)
//    {
//        System.out.println("a = " + a + ", b = " + b);
//    }
//
//    Test(byte a, float b)
//    {
//        System.out.println("a = " + a + ", b = " + b);
//    }

    public static void showValues(int a, int b)
    {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void showValues(int a, float b)
    {
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void main(String[] args)
    {
        byte a = 10;
        byte b = 15;
//        Test test = new Test(a, b);
        showValues(a, b);
    }
}