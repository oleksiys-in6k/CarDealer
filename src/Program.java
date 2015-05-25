import java.awt.*;
import java.util.*;
import java.util.List;

public class Program {

    private List <Deal> deals = new ArrayList<>();
    private List<Customer> sellers;
    private List<Customer> buyers;
    private List<Car> cars;


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

        SearchingForTheBestSeller searchingForTheBestSeller = new SearchingForTheBestSeller(sellers,deals);
        Customer seller = searchingForTheBestSeller.getBestSellerFromListSellers(sellers);
        System.out.println("Best seller ever is " + seller.getName());

    }
}
