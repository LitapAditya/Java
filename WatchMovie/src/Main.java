import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("""
                CHOOSE THE FOLLOWING
                1.ADVENTURE MOVIE
                2.COMEDY MOVIE
                3.SCIENCE FICTION MOVIE""");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE TYPE OF MOVIE THAT YOU WANT TO WATCH");
        String string = scanner.nextLine();
        Movie movie = getMovieObject(string);
        movie.watchMovie();
    }

    public static Movie getMovieObject(String string)
    {
        string = string.toLowerCase();
        Movie movie = new Movie();

        if (string.contains("adventure"))
            string = "adventure";
        else if (string.contains("comedy"))
            string = "comedy";
        else if (string.contains("science"))
            string = "science";

        switch (string)
        {
            case "adventure":
                movie = new AdventureMovie();
                break;

            case "comedy":
                movie = new ComedyMovie();
                break;

            case "science":
                movie = new ScienceFictionMovie();
                break;

            default:
                break;
        }
        return movie;
    }
}