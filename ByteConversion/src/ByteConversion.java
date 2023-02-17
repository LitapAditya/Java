public class ByteConversion
{
    void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if (kiloBytes < 0)
            System.out.println("INVALID VALUE");

        else
        {
            System.out.println(kiloBytes + " KB = " + kiloBytes / 1024 + " MB " + kiloBytes % 1024 + " KB");
        }
    }
}