import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THE SIZE IN KB");
        Scanner scanner = new Scanner(System.in);
        int kiloBytes = scanner.nextInt();
        ByteConversion converter = new ByteConversion();
        converter.printMegaBytesAndKiloBytes(kiloBytes);
    }
}