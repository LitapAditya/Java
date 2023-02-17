public class DayOfWeek
{
    public void dayAtThatNumber(int number)
    {
        switch (number)
        {
            case 1:
                System.out.println("MONDAY");
                break;

            case 2:
                System.out.println("TUESDAY");
                break;

            case 3:
                System.out.println("WEDNESDAY");
                break;

            case 4:
                System.out.println("THURSDAY");
                break;

            case 5:
                System.out.println("FRIDAY");
                break;

            case 6:
                System.out.println("SATURDAY");
                break;

            case 7:
                System.out.println("SUNDAY");
                break;

            default:
                System.out.println("INVALID CHOICE");
                break;
        }
    }

    public void ifDayAtThatWeek(int number)
    {
        if (number == 1)
            System.out.println("MONDAY");
        else if (number == 2)
            System.out.println("TUESDAY");
        else if (number == 3)
            System.out.println("WEDNESDAY");
        else if (number == 4)
            System.out.println("THURSDAY");
        else if (number == 5)
            System.out.println("FRIDAY");
        else if (number == 6)
            System.out.println("SATURDAY");
        else if (number == 7)
            System.out.println("SUNDAY");
        else
            System.out.println("INVALID CHOICE");
    }
}
