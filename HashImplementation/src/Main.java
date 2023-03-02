import java.util.HashSet;
import java.util.Set;

public class Main
{
    public static void main(String[] args)
    {
        ProGamer proGamer1 = new ProGamer("BLACK BURN",     1022, "OUTER-WORLDS");
        ProGamer proGamer2 = new ProGamer("FALSE SHEPHERD", 119,  "BIO-SHOCK");
        ProGamer proGamer3 = new ProGamer("GORDON FREEMAN", 119,  "HALF-LIFE");
        ProGamer proGamer4 = new ProGamer("TOKEN HUNTER",   226,  "FALLOUT-4");
        ProGamer proGamer5 = new ProGamer("CLOVER FIELD",   335,  "YURI'S-REVENGE");
        ProGamer proGamer6 = new ProGamer("CLOVER FIELD",   335,  "YURI'S-REVENGE");

        Set<ProGamer> proGamerSet = new HashSet<>();

        proGamerSet.add(proGamer1);
        proGamerSet.add(proGamer2);
        proGamerSet.add(proGamer3);
        proGamerSet.add(proGamer4);
        proGamerSet.add(proGamer5);
        proGamerSet.add(proGamer6);

        for (ProGamer o : proGamerSet)
        {
            System.out.println("ALIAS: " + o.getName());
        }
    }
}