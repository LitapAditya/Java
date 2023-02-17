public class Bank
{
    String name;
    String address;
    int balance;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public int getBalance()
    {
        return balance;
    }

    public void setBalance(int balance)
    {
        this.balance = balance;
    }

    void withdraw(int withdrawAmount)
    {
        if (withdrawAmount > balance)
            System.out.println("INSUFFICIENT FUNDS");

        else
        {
            balance = balance - withdrawAmount;
            System.out.println("COLLECTED AMOUNT: " + withdrawAmount + "\n" + "BALANCE: " + balance);
        }
    }

    void deposit(int depositedAmount)
    {
        if (depositedAmount < 0)
        {
            System.out.println("INVALID INPUT");
        }

        else
        {
            balance = balance + depositedAmount;
            System.out.println("BALANCE :" + balance);
        }
    }
}
