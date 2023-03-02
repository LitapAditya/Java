public class ProGamer
{
    String name;
    int rating;
    String game;

    public ProGamer(String name, int rating, String game)
    {
        this.name = name;
        this.rating = rating;
        this.game = game;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public String getGame()
    {
        return game;
    }

    public void setGame(String game)
    {
        this.game = game;
    }

    @Override
    public boolean equals(Object o)
    {
        System.out.println("EEEEEEEEEEEEEEEEEEEEEEEEEE");
        ProGamer proGamer = (ProGamer) o;
        if (this.getName().equals(proGamer.getName()) && this.getRating() == proGamer.getRating() && this.getGame().equals(proGamer.getGame()))
            return true;

        return false;
    }

    @Override
    public int hashCode()
    {
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHH");
        return (Integer) (this.getName().hashCode()+this.rating+this.getGame().hashCode());
    }
}