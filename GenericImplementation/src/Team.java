import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player>
{
    private List<T> list = new ArrayList<>();

    public void addPlayer(T player)
    {
        list.add(player);
    }

    @Override
    public String toString()
    {
        return "Team{" +
                "list=" + list +
                '}';
    }
}
