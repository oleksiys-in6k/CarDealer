import java.util.List;

public class Program {

    List<Deal> deals;
    List<Car> cars;
    List<Seller> sellers;

    public static void main(String[] args) {

        new Program().initialization();
        new Program().searchingBestSeller();
    }

    private void searchingBestSeller() {
        Period period = new Period();

        SearchingForTheBestSeller searchingForTheBestSeller = new SearchingForTheBestSeller(sellers, deals, period);
        Seller seller = searchingForTheBestSeller.getBestSellerFromListSellers(sellers);
        System.out.println("Best seller ever is " + seller.getName());

    }

    public void initialization() {
        InputData inputData = new InputData();
        cars = inputData.getListOfCar();
        sellers = inputData.getListOfSeller();
        deals = inputData.getDeals();
    }
}
