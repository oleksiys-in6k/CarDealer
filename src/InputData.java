import java.util.ArrayList;
import java.util.List;

public class InputData {
    private List <Car> cars = new ArrayList<>();
    private List <Customer> buyers = new ArrayList<>();
    private List <Customer> sellers = new ArrayList<>();

    public List<Car> getListOfCar() {
        cars.add(new Car("BMW","x1",10000));
        cars.add(new Car("BMW","x3",20000));
        cars.add(new Car("BMW","x5",30000));
        cars.add(new Car("AUDI","A1",100));
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
}
