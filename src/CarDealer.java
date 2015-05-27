import java.util.Calendar;
import java.util.List;

public class CarDealer {


    List<Seller> sellers;
    List<Deal> deals;
    List<Car> cars;

    public void init () {
        InputData inputData = new InputData();

        cars =  inputData.getListOfCar();
        sellers = inputData.getListOfSeller();
        deals = inputData.getListOfDeals();
    }

    public void searchingBestSeller() {
        Period period = new Period();

        SearchingForTheBestSeller searchingForTheBestSeller = new SearchingForTheBestSeller(sellers, deals, period);
        Seller seller = searchingForTheBestSeller.getBestSellerFromListSellers(sellers);
        System.out.println("Best seller ever is " + seller.getName());
    }

}
