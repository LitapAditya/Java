public class Computer implements Comparable<Computer>
{
    String model;

    String type;
    int rating;

    public Computer(String model, String type, int rating)
    {
        this.model = model;
        this.rating = rating;
        this.type = type;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    @Override
    public String toString()
    {
        return "Computer{" +
                "model='" + model + '\'' +
                ", rating=" + rating +
                ", type=" + type +
                '}';
    }

    @Override
    public int compareTo(Computer o)
    {
        return this.getModel().compareTo(o.getModel());
    }
}