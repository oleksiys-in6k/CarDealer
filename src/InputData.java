import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InputData {
    List <Car> cars = new ArrayList<Car>();
    List <Seller> sellers = new ArrayList<Seller>();
    List <Deal> deals = new ArrayList<Deal>();

    public List<Car> getListOfCar() {
        cars.add(new Car("BMW",     "x1",       10000));
        cars.add(new Car("BMW",     "x3",       20000));
        cars.add(new Car("BMW",     "x5",       30000));
        cars.add(new Car("AUDI",    "A1",       100));
        cars.add(new Car("AUDI",    "A2",       200));
        cars.add(new Car("AUDI",    "A3",       300));
        cars.add(new Car("AUDI",    "A4",       400));
        cars.add(new Car("AUDI",    "A5",       500));
        cars.add(new Car("AUDI",    "A6",       600));
        cars.add(new Car("AUDI",    "A7",       700));
        return cars;
    }

    public List<Seller> getListOfSeller() {
        sellers.add(new Seller("Alex"));
        sellers.add(new Seller("Bob"));
        sellers.add(new Seller("Conrad"));
        sellers.add(new Seller("Denis"));
        return sellers;
    }

    public List<Deal> getListOfDeals() {

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, Calendar.JANUARY, 1);

        deals.add(new Deal(sellers.get(0), cars.get(9), calendar));
        calendar.set(2015, Calendar.FEBRUARY, 2);
        deals.add(new Deal(sellers.get(0), cars.get(6), calendar));
        calendar.set(2015, Calendar.MARCH, 3);
        deals.add(new Deal(sellers.get(2), cars.get(5), calendar));
        calendar.set(2015, Calendar.APRIL, 4);
        deals.add(new Deal(sellers.get(0), cars.get(6), calendar));
        calendar.set(2015, Calendar.MAY, 5);
        deals.add(new Deal(sellers.get(0), cars.get(4), calendar));
        calendar.set(2015, Calendar.DECEMBER, 6);
        deals.add(new Deal(sellers.get(0), cars.get(3), calendar));

        return deals;
    }
}
