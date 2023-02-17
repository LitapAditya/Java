public class NumberOfDaysInAMonth
{
    public void numberOfDaysInAMonth(int monthNumber)
    {
        switch (monthNumber)
        {
            case 1,3,5,7,8,10,12:
                System.out.println("31 DAYS");
                break;

            case 4,6,9,11:
                System.out.println("30 DAYS");
                break;

            case 2:
                System.out.println("28 DAYS");
                break;

            default:
                System.out.println("INVALID CHOICE");
        }
    }

    public void ifIsNumberOfDaysInAMonth(int monthNumber)
    {
        if (monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12)
            System.out.println("31 DAYS");
        else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11)
            System.out.println("30 DAYS");
        else
            System.out.println("INVALID CHOICE");
    }
}
