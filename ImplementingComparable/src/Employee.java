import java.util.Comparator;

public class Employee implements Comparator<Employee>
{
    String name;

    int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
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



    @Override
    public String toString()
    {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compare(Employee o1, Employee o2)
    {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}