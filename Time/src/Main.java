public class Main
{
    public static void main(String[] args)
    {
        Time timeOne = new Time(40,40,40);
        Time timeTwo = new Time(30,30,30);

        timeOne.addTime(timeTwo);

        System.out.println(timeOne);
    }
}