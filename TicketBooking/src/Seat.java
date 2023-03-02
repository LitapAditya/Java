public class Seat implements Comparable<Seat>
{
    private String seatNumber;
    private boolean reserved;

    public Seat(String seatNumber)
    {
        this.seatNumber = seatNumber;
        this.reserved = false;
    }
    public String getSeatNumber()
    {
        return seatNumber;
    }

    public boolean reserve()
    {
        if(!reserved){
            reserved = true;
            return true;
        }
        return false;
    }

    public void cancel(){
        if(reserved)
        {
            reserved = false;
        }
    }

    @Override
    public int compareTo(Seat seat) {
        return this.seatNumber.compareTo(seat.seatNumber);
    }
}