public class Main
{
    public static void main(String[] args)
    {
        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println(printer.getPagesPrinted());
    }
}