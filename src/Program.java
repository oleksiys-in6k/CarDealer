import java.util.*;

public class Program {

    List <Car> cars = new ArrayList<>();
    List <Customer> buyers = new ArrayList<>();
    List <Customer> sellers = new ArrayList<>();
    List <Deal> deals = new ArrayList<>();


    public static void main(String[] args) {
        new Program().addActions();

    }

    private void addActions() {
        input();
        creatingDeals();
        System.out.println("===================");
        output();
    }

    private void creatingDeals() {
        boolean flag;
        do {
            System.out.println("List of buyer");
            Customer buyer = ChooseCustomerFromList(buyers);
            System.out.println("List of seller");
            Customer seller = ChooseCustomerFromList(sellers);
            System.out.println("List of car");
            Car car = ChooseCarFromList(cars);

            Deal deal = new Deal(buyer, seller, car);
            deals.add(deal);
            flag = continueInputDeals();
        } while (flag);
    }

    private boolean continueInputDeals() {
        System.out.println("Create new deal? ");
        System.out.println("1 - yes, 2 - no");
        String index = keyboard("");

        switch (index) {
            case "1" :
                return true;
            case "2" :
                return false;
            default :
                System.out.println("Wrong input, try again");
                continueInputDeals();
                break;
        }
        return false;
    }

    private Car ChooseCarFromList(List<Car> carsList) {
        if (isEmptyList(carsList)) return  null;
        for (int currentCar = 0; currentCar < carsList.size(); currentCar++) {
            System.out.println( "\t" + (currentCar + 1) + ") " + carsList.get(currentCar).getBrand() + "\t" + carsList.get(currentCar).getModel() + "\t" + carsList.get(currentCar).getPrice());
        }
        String reply = keyboard("Choose car");
        Integer index = Integer.valueOf(reply);
        if (index <= carsList.size()) {
            return carsList.get(index - 1);
        } else {
            System.out.println("You've selected incorrect product index. Try again.");
            return ChooseCarFromList(carsList);
        }
    }

    private Customer ChooseCustomerFromList (List<Customer> customersList) {
        if (isEmptyList(customersList)) return null;
        for (int currentCustomer = 0; currentCustomer < customersList.size(); currentCustomer++) {
            System.out.println("\t" + (currentCustomer + 1) + ") " + customersList.get(currentCustomer).getName());
        }
        String reply = keyboard("Choose party");
        Integer index = Integer.valueOf(reply);
        if (index <= customersList.size()) {
            return customersList.get(index - 1);
        } else {
            System.out.println("You've selected incorrect product index. Try again.");
            return ChooseCustomerFromList(customersList);
        }

    }

    private boolean isEmptyList(List list) {
        if (list.isEmpty()) {
            System.out.println("No products to select. Input is required.");
            return true;
        }
        return false;
    }

    private void output() {
        System.out.println("Enter first date");
        Calendar dateBeginningOfPeriod = getTheCalendar();

        System.out.println("Enter second date");
        Calendar dateEndingOfPeriod = getTheCalendar();

        for (Customer customer : sellers) {
            printSalesOfPeriod(customer, dateBeginningOfPeriod, dateEndingOfPeriod);
        }
    }

    private void printSalesOfPeriod(Customer customer, Calendar date1, Calendar date2) {
//        String bestSeller;
        int countOfDeals = 0;
        System.out.println("Seller " + customer.getName());
        for (Deal deal : deals) {
            if (date1.before(deal.getCalendar()) && date2.after(deal.getCalendar()) && deal.getSeller().getName().equals(customer.getName())) {
                System.out.println(countOfDeals + 1 + ")");
                System.out.println("\tBuyer " + deal.getBuyer().getName());
                System.out.println("\tCar \t" + deal.getCar().getBrand() + "\t" + deal.getCar().getModel());
                System.out.println("\tPrice \t" + deal.getCar().getPrice());
                countOfDeals++;
            }
        }
        System.out.println("count of deals = "+ countOfDeals+ "\n");
    }

    private Calendar getTheCalendar() {
        int year = Integer.valueOf(keyboard("year"));
        int month = Integer.valueOf(keyboard("month"));
        int day = Integer.valueOf(keyboard("day"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month,day);
        return calendar;
    }

    private void input() {
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

        buyers.add( new Customer("Stepan"));
        buyers.add(new Customer("Petro"));
        buyers.add(new Customer("Ivan"));
        buyers.add(new Customer("Inokentiy"));

        sellers.add(new Customer("Alex"));
        sellers.add(new Customer("Bob"));
        sellers.add(new Customer("Conrad"));
    }

    private String keyboard(String message) {
        System.out.print(message + " ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

}
