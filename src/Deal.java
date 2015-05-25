import java.util.Calendar;

public class Deal {


    private final Calendar calendar = Calendar.getInstance();

    private final Customer buyer;

    private final Customer seller;

    private final Car car;

    public Car getCar() {
        return car;
    }

    public Deal(Customer buyer, Customer seller, Car car) {
        this.buyer = buyer;
        this.seller = seller;
        this.car = car;
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
