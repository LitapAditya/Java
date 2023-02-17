public class Score
{
    int calculateHighScore(int score)
    {
        if (score >= 1000)
            return 1;

        else if (score >= 500)
            return 2;

        else if (score >= 100)
            return 3;

            return 4;
    }

    void displayHighScore(int score)
    {
        System.out.println("YOU HAVE ACHIEVED POSITION " + calculateHighScore(score));
    }
}
