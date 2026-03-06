package feb_25_2026.class_object;

public class Product {

    int id;
    String brand;
    String name;
    double price;

    // Constructor
    public Product(int id, String brand, String name, double price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product [ID=" + id +
                ", Brand=" + brand +
                ", Name=" + name +
                ", Price=" + price + "]";
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Product)) {
            return false;
        }

        Product otherProduct = (Product) obj;

        return id == otherProduct.id
                && brand.equals(otherProduct.brand)
                && name.equals(otherProduct.name)
                && price == otherProduct.price;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, brand, name, price);
    }
}