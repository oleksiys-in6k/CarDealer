import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class InputData {
    List <Car> cars = new ArrayList<>();
    List <Customer> sellers = new ArrayList<>();
    List <Customer> buyers = new ArrayList<>();
    List <Deal> deals = new ArrayList<>();

    public List<Car> getListOfCar() {


        cars.add(new Car("BMW",     "x1",       10000));
        cars.add(new Car("BMW",     "x3",       20000));
        cars.add(new Car("BMW",     "x5",       30000));
        cars.add(new Car("AUDI",    "A1",       100));
        cars.add(new Car("AUDI","A2",200));
        cars.add(new Car("AUDI","A3",300));
        cars.add(new Car("AUDI","A4",400));
        cars.add(new Car("AUDI","A5",500));
        cars.add(new Car("AUDI","A6",600));
        cars.add(new Car("AUDI","A7",700));
        return cars;
    }

    public List<Customer> getListOfSeller() {


        sellers.add(new Customer("Alex"));
        sellers.add(new Customer("Bob"));
        sellers.add(new Customer("Conrad"));
        return sellers;
    }

    public List<Customer> getListOfBuyer() {


        buyers.add( new Customer("Stepan"));
        buyers.add(new Customer("Petro"));
        buyers.add(new Customer("Ivan"));
        buyers.add(new Customer("Inokentiy"));
        return buyers;
    }

    public List<Deal> getDeals() {
        List <Deal> deals = new ArrayList<>();
        Deal deal;
        Random random = new Random();

        /*
        for (int j = 0; j < 10; j++) {
            deal = new Deal(buyers.get(random.nextInt(4)), sellers.get(random.nextInt(3)), cars.get(random.nextInt(9)));
            deals.add(deal);
        }

        */
        Calendar calendar = Calendar.getInstance();
        calendar.set(2015, 1, 1);
        deals.add(new Deal(buyers.get(3), sellers.get(2), cars.get(9), calendar));
        calendar.set(2015, 1, 2);
        deals.add(new Deal(buyers.get(3), sellers.get(1), cars.get(6), calendar));
        calendar.set(2015, 1, 3);
        deals.add(new Deal(buyers.get(3), sellers.get(1), cars.get(5), calendar));
        calendar.set(2015, 1, 4);
        deals.add(new Deal(buyers.get(1), sellers.get(1), cars.get(6), calendar));
        calendar.set(2015, 1, 5);
        deals.add(new Deal(buyers.get(1), sellers.get(2), cars.get(4), calendar));
        calendar.set(2015, 1, 6);
        deals.add(new Deal(buyers.get(1), sellers.get(2), cars.get(3), calendar));


        return deals;
    }
}
