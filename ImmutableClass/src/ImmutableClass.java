final public class ImmutableClass
{
    private String address;
    private int age;

    public ImmutableClass()
    {
        this("NO NAME", 0);
    }

    public ImmutableClass(String address, int age)
    {
        this.address = address;
        this.age = age;
    }

    public String getAddress()
    {
        return address;
    }

    public int getAge()
    {
        return age;
    }
}