import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Theatre
{
    private String name;

    private int bookedMin;

    private List<Seat> seats = new ArrayList<>();

    public Theatre(String name, int noOfRows, int seatsPerRows)
    {
        this.name = name;

        char ch = 'A';

        for (int i = 1; i <= noOfRows; i++)
        {
            for (int j = 1; j <= seatsPerRows; j++)
            {
                Seat seat = new Seat(ch+String.format("%02d", j));
                seats.add(seat);
            }
            ch++;
        }
    }

    public boolean reserve(String seatNumber)
    {
        Seat tempSeat = new Seat(seatNumber);
        int index = Collections.binarySearch(seats, tempSeat);
        if(index >= 0)
        {
            final Date bookingTime = new Date();
            bookedMin = bookingTime.getSeconds();
            return seats.get(index).reserve();
        }
        return false;
    }

    public void cancelTicket(String seatNumber)
    {
        Date currentTime = new Date();
        int currentMin = currentTime.getSeconds();
        if (currentMin - bookedMin > 10)
        {
            System.out.println("CANNOT CANCEL THE TICKET");
        }

        else
        {
            Seat tempSeat = new Seat(seatNumber);
            int index = Collections.binarySearch(seats, tempSeat);
            if(index >= 0)
            {
                seats.get(index).cancel();
            }
            System.out.println("TICKET CANCELLED");
        }
    }
}