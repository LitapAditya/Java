import java.util.Comparator;

public class CompareByType implements Comparator<Employee>
{
    public int compare(Employee o1, Employee o2)
    {
        return o1.getComputer().compareTo(o2.getComputer());
    }
}
