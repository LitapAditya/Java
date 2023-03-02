import java.util.Comparator;

public class Employee implements Comparable<Employee>
{
    String name;
    int age;
    Computer computer;

    public Employee(String name, int age, Computer computer)
    {
        this.name = name;
        this.age = age;
        this.computer = computer;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public Computer getComputer()
    {
        return computer;
    }

    public void setComputer(Computer computer)
    {
        this.computer = computer;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", computer=" + computer +
                '}';
    }

    @Override
    public int compareTo(Employee o)
    {
        return this.getComputer().compareTo(o.getComputer());
    }
}