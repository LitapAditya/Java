import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THREE ANGLES");
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        Score score = new Score();
        int angleOne = scanner.nextInt();
        int angleTwo = scanner.nextInt();
        int angleThree = scanner.nextInt();
        int highScore = scanner.nextInt();

        triangle.printValidation(angleOne, angleTwo, angleThree);

        score.displayHighScore(highScore);
    }
}