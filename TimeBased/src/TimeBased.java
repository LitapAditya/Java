import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeBased
{
    public void ageCalculator()
    {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        System.out.println("ENTER DAY, MONTH AND YEAR OF BIRTH");

        int dayOfBirth = Integer.parseInt(scanner.nextLine());
        int monthOfBirth = Integer.parseInt(scanner.nextLine());
        int yearOfBirth = Integer.parseInt(scanner.nextLine());

        int currentDay = Integer.parseInt(new SimpleDateFormat("dd").format(date));
        int currentMonth = Integer.parseInt(new SimpleDateFormat("MM").format(date));
        int currentYear = Integer.parseInt(new SimpleDateFormat("yyyy").format(date));

        int totalDays = 0;

        for (int year = yearOfBirth; year <= currentYear; year++)
        {
            int month = 1;

            if (year == yearOfBirth)
                month = monthOfBirth;

            if (year == currentYear)
                month = 12 - currentMonth;

            while (month <= 12)
            {
                int day = 1;

                if (year == yearOfBirth && month == monthOfBirth)
                    day = dayOfBirth;

                if (year==currentYear && month == currentMonth)
                    day = 31 - currentDay;

                if (month == 2)
                    day = day + 2;

                if (isLeapYear(year) && month == 2)
                    day = day + 1;

                if (month == 2 || month == 4 || month == 6 || month == 9 || month == 11)
                    day = day - 1;

                while (day <= 31)
                {
                    totalDays++;
                    day++;
                }

                month++;
            }

        }

        int totalYears = totalDays % 365;
        totalDays = totalDays / 365;
        int totalMonths = totalDays % 12;
        totalDays = totalDays / 12;

        System.out.println("AGE IS " + totalYears + " YEARS " + totalMonths + " MONTHS " + totalDays + " DAYS ");
    }

    public boolean isLeapYear(int year)
    {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

}
