
public class Seller {

    private String name;

    public Seller(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Seller seller = (Seller) o;

        return name.equals(seller.name);

    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
