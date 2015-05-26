import java.util.Calendar;

public class Deal {

    private Calendar calendar = Calendar.getInstance();

    private final Seller seller;

    private final Car car;

    public Deal(Seller seller, Car car, Calendar calendar) {
        this.seller = seller;
        this.car = car;
        this.calendar.setTime(calendar.getTime());
    }

    public Car getCar() {
        return car;
    }

    public Seller getSeller() {
        return seller;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public boolean wasSoldBy(Seller seller) {
        return this.seller.equals(seller);
    }

}
