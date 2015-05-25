import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class SearchingForTheBestSeller {

    private List <Deal> deals = new ArrayList<>();
    private List<Customer> sellers;

    public SearchingForTheBestSeller(List<Customer> sellers, List<Deal> deals) {
        this.sellers = sellers;
        this.deals = deals;
    }


    public Customer getBestSellerFromListSellers(List<Customer> sellers) {
        Customer bestSellerEver = null;
        int maxCountOfSales = 0;
        int countOfSalesForCurrentSaller;
        System.out.println("Enter first date");
        Calendar dateBeginningOfPeriod = getTheCalendar();

        System.out.println("Enter second date");
        Calendar dateEndingOfPeriod = getTheCalendar();

        for (Customer customer : sellers) {
            countOfSalesForCurrentSaller = getCountOfDealsInCurrentSellerInPeriod(customer, dateBeginningOfPeriod,dateEndingOfPeriod);
            if ( countOfSalesForCurrentSaller > maxCountOfSales ) {
                bestSellerEver = customer;
                maxCountOfSales = countOfSalesForCurrentSaller;
            }
        }
        return bestSellerEver;
    }

    private int getCountOfDealsInCurrentSellerInPeriod(Customer customer, Calendar dateBeginningOfPeriod, Calendar dateEndingOfPeriod) {
        int countOfDeals = 0;
        for (int i = 0; i < deals.size() - 1; i++) {
            if (betweenInputedDays(dateBeginningOfPeriod, dateEndingOfPeriod, deals.get(i)))
                if (isCurrentSeller(customer, deals.get(i))) {
                    countOfDeals++;
                }
        }
        return countOfDeals;
    }

    private boolean isCurrentSeller(Customer customer, Deal deal) {
        return deal.getSeller().getName().equals(customer.getName());
    }

    private boolean betweenInputedDays(Calendar date1, Calendar date2, Deal deal) {
        return date1.before(deal.getCalendar()) && date2.after(deal.getCalendar());
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
