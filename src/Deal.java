import java.util.Calendar;

public class Deal {


    private Calendar calendar = Calendar.getInstance();

    private final Customer buyer;

    private final Customer seller;

    private final Car car;

    public Deal(Customer buyer, Customer seller, Car car, Calendar calendar) {
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
        this.calendar.setTime(calendar.getTime());
        //this.calendar = calendar;
    }

    public Car getCar() {
        return car;
    }

    public Customer getBuyer() {
        return buyer;
    }

    public Customer getSeller() {
        return seller;
    }

    public Calendar getCalendar() {
        return calendar;
    }


}
