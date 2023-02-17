package ImmutableList;

import java.util.List;

public final class Person
{
    private final String name;
    private final int age;
    private Address address;

    public Person(String name, int age,Address address)
    {
        this.name = name;
        this.age = age;
        this.address = new Address(address.getStreetAddress(), address.getCity(), address.getPinCode());
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Address getAddress()
    {
        return new Address(this.address.getStreetAddress(), this.address.getCity(), this.address.getPinCode());
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
