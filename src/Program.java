import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Program {

    List<Deal> deals;
    List<Car> cars;
    List<Customer> sellers;
    List<Customer> buyers;


    public static void main(String[] args) {
        new Program().addActions();
    }

    public void addActions() {
        InputData inputData = new InputData();
        cars = inputData.getListOfCar();
        sellers = inputData.getListOfSeller();
        buyers = inputData.getListOfBuyer();
        deals = inputData.getDeals();

        System.out.println("===================");

        SearchingForTheBestSeller searchingForTheBestSeller = new SearchingForTheBestSeller(sellers, deals);
        Customer seller = searchingForTheBestSeller.getBestSellerFromListSellers(sellers);
        System.out.println("Best seller ever is " + seller.getName());
//        System.out.println(getBestSellerFromListSellers(sellers).getName());

    }
}
