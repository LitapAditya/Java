public class Printer
{
    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex)
    {
        if (tonerLevel >= 0 && tonerLevel <= 100)
        {
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount)
    {
        if (tonerAmount > -1 && tonerAmount <= 100)
        {
            if (this.tonerLevel + tonerAmount > 100)
            {
                return -1;
            }

            else
            {
                this.tonerLevel += tonerAmount;
            }
            return this.tonerLevel;
        }

        else
        {
            return -1;
        }
    }

    public int printPages(int pages)
    {
        int pagesToPrint = pages;
        if (this.duplex)
        {
            pagesToPrint = (pages / 2 + pages % 2);
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted()
    {
        return this.pagesPrinted;
    }
}
