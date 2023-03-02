public class Employee extends Person
{
    int id;
    String designation;

    public Employee(String name, int age, int id, String designation)
    {
        super(name, age);
        this.id = id;
        this.designation = designation;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getDesignation()
    {
        return designation;
    }

    public void setDesignation(String designation)
    {
        this.designation = designation;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", designation='" + designation + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}