import java.util.Scanner;

public class ByteConversion
{
    public static void main(String[] args)
    {
        System.out.println("PRESS 0 OR 1 TO ENTER VALUE IN KB OR MB RESPECTIVELY");
        Scanner scanner = new Scanner(System.in);
        double byteFormat = scanner.nextInt();
        System.out.println("ENTER THE SIZE");
        double byteValue = scanner.nextDouble();

        if (byteFormat == 0)
            System.out.println("VALUE IN MB IS: " + (byteValue / 1000));
        else
            System.out.println("VALUE IN KB IS: " + (byteValue * 1000));
    }
}
