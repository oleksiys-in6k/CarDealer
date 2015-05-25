import java.util.*;

public class Program {

    private List <Deal> deals = new ArrayList<>();

    public static void main(String[] args) {
        new Program().addActions();
    }

    public void addActions() {
        InputData inputData = new InputData();
        List<Car> cars = inputData.getListOfCar();
        List<Customer> sellers = inputData.getListOfSeller();
        List<Customer> buyers = inputData.getListOfBuyer();

        deals = CreatingListDeals.getNewDeals(buyers, sellers, cars);

        System.out.println("===================");
        output(sellers);
    }

    private void output(List <Customer> sellers) {
        System.out.println("Enter first date");
        Calendar dateBeginningOfPeriod = getTheCalendar();

        System.out.println("Enter second date");
        Calendar dateEndingOfPeriod = getTheCalendar();

        for (Customer customer : sellers) {
            printSalesOfPeriod(customer, dateBeginningOfPeriod, dateEndingOfPeriod);
        }
    }

    private void printSalesOfPeriod(Customer customer, Calendar date1, Calendar date2) {
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
        System.out.println("count of deals = " + countOfDeals + "\n");
    }

    private Calendar getTheCalendar() {
        int year = Integer.valueOf(keyboard("year"));
        int month = Integer.valueOf(keyboard("month"));
        int day = Integer.valueOf(keyboard("day"));
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);
        return calendar;
    }

    private String keyboard(String message) {
        System.out.print(message + " ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
