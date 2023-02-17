import java.util.Objects;

public class Person
{
    String name;
    int age;
    String address;

    public Person()
    {
        this("NO NAME", 0 ,"NO ADDRESS");
    }

    public Person(String name, int age, String address)
    {
        this.name = new String(name);
        this.age = age;
        this.address = new String(address);
    }

    public boolean equals(Object personTwo)
    {
//        System.out.println(objectPerson instanceof Person);
        Person person = (Person) personTwo;
        return this.name.equals(person.name) && this.age == person.age && this.address.equals(person.address);
    }
}