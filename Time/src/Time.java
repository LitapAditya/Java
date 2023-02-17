public class Time
{
    private int hour;
    private int minute;
    private int second;

    public Time()
    {
        this(0,0,0);
    }

    public Time(int hour, int minute, int second)
    {
        this.hour = Math.max(hour, 0);
        this.minute = Math.max(minute, 0);
        this.second = Math.max(second, 0);
    }

    public int getHour()
    {
        return hour;
    }

    public void setHour(int hour)
    {
        this.hour = Math.max(hour, 0);
    }

    public int getMinute()
    {
        return minute;
    }

    public void setMinute(int minute)
    {
        this.minute = Math.max(minute, 0);
    }

    public int getSecond()
    {
        return second;
    }

    public void setSecond(int second)
    {
        this.second = Math.max(second, 0);
    }

    @Override
    public String toString()
    {
        return "Time{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    public void addTime(Time time)
    {
        this.hour += time.hour;
        this.minute += time.minute;
        this.second += time.second;

        while (this.second >= 60)
        {
            this.second %= 60;
            this.minute += 1;
        }

        while (this.minute >= 60)
        {
            this.minute %= 60;
            this.hour += 1;
        }

        while (this.hour >= 24)
        {
            this.hour %= 24;
        }
    }
}