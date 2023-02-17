package ImmutableList;

public class Address
{
    String streetAddress;
    String city;
    int pinCode;

    public Address(String streetAddress, String city, int pinCode)
    {
        this.streetAddress = streetAddress;
        this.city = city;
        this.pinCode = pinCode;
    }

    public String getStreetAddress()
    {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress)
    {
        this.streetAddress = streetAddress;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public int getPinCode()
    {
        return pinCode;
    }

    public void setPinCode(int pinCode)
    {
        this.pinCode = pinCode;
    }

    @Override
    public String toString()
    {
        return "Address{" +
                "streetAddress='" + streetAddress + '\'' +
                ", city='" + city + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
