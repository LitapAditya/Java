import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Permutations permutations = new Permutations();
        System.out.println("ENTER A WORD");
        String givenString = scanner.nextLine();
        permutations.getPermutations(givenString);
    }
}