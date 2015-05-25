import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreatingListDeals {

    public static List<Deal> getNewDeals(List<Customer> buyers, List<Customer> sellers, List<Car> cars) {
        boolean flag;
        List <Deal> deals = new ArrayList<>();
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
        return deals;
    }

    private static boolean continueInputDeals() {
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

    private static Car ChooseCarFromList(List<Car> carsList) {
        if (isEmptyList(carsList)) return  null;
        showAllCars(carsList);
        String reply = keyboard("Choose car");
        Integer index = Integer.valueOf(reply);
        if (index <= carsList.size()) {
            return carsList.get(index - 1);
        } else {
            System.out.println("You've selected incorrect product index. Try again.");
            return ChooseCarFromList(carsList);
        }
    }

    private static void showAllCars(List<Car> carsList) {
        for (int currentCar = 0; currentCar < carsList.size(); currentCar++) {
            System.out.println( "\t" + (currentCar + 1) + ") " + carsList.get(currentCar).getBrand() + "\t" +
                    carsList.get(currentCar).getModel() + "\t" + carsList.get(currentCar).getPrice());
        }
    }

    private static Customer ChooseCustomerFromList(List<Customer> customersList) {
        if (isEmptyList(customersList)) return null;
        showAllCustomer(customersList);
        String reply = keyboard("Choose party");
        Integer index = Integer.valueOf(reply);
        if (index <= customersList.size()) {
            return customersList.get(index - 1);
        } else {
            System.out.println("You've selected incorrect product index. Try again.");
            return ChooseCustomerFromList(customersList);
        }
    }

    private static void showAllCustomer(List<Customer> customersList) {
        for (int currentCustomer = 0; currentCustomer < customersList.size(); currentCustomer++) {
            System.out.println("\t" + (currentCustomer + 1) + ") " + customersList.get(currentCustomer).getName());
        }
    }

    private static boolean isEmptyList(List list) {
        if (list.isEmpty()) {
            System.out.println("No products to select. Input is required.");
            return true;
        }
        return false;
    }

    private static String keyboard(String message) {
        System.out.print(message + " ");
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
