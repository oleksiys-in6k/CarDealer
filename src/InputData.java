import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class InputData {
    List <Car> cars = new ArrayList<>();
    List <Seller> sellers = new ArrayList<>();

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

    public List<Deal> getDeals() {
        List <Deal> deals = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 1, 1);
        deals.add(sellers.get(0), cars.get(9), calendar);
        calendar.set(2015, 2, 2);
        deals.add(sellers.get(0), cars.get(6), calendar);
        calendar.set(2015, 2, 3);
        deals.add(sellers.get(2), cars.get(5), calendar);
        calendar.set(2015, 2, 4);
        deals.add(sellers.get(0), cars.get(6), calendar);
        calendar.set(2015, 2, 5);
        deals.add(sellers.get(0), cars.get(4), calendar);
        calendar.set(2015, 2, 6);
        deals.add(sellers.get(0), cars.get(3), calendar);
        return deals;
    }
}
