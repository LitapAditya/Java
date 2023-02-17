package ImmutableList;

import java.util.LinkedList;
import java.util.List;

public final class AnotherPerson
{
    private final String name;
    private final int age;
    private List<Address> addresses;

    public AnotherPerson(String name, int age, List<Address> addresses)
    {
        this.name = name;
        this.age = age;
        this.addresses = new LinkedList<>();
        for (Address address : addresses)
        {
            this.addresses.add(new Address(address.getStreetAddress(), address.getCity(), address.getPinCode()));
        }
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public List<Address> getAddresses()
    {
        List<Address> newAddresses = new LinkedList<>();
        for (Address address : this.addresses)
        {
            newAddresses.add(new Address(address.getStreetAddress(), address.getCity(), address.getPinCode()));
        }
        return newAddresses;
    }

    @Override
    public String toString()
    {
        return "AnotherClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addresses=" + addresses +
                '}';
    }
}