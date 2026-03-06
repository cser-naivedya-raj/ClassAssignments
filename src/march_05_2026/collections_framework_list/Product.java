package march_05_2026.collections_framework_list;

public class Product {

    int id;
    String brand;
    String name;
    double price;

    // Constructor to initialize product details
    public Product(int id, String brand, String name, double price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.price = price;
    }

    // Display product information
    @Override
    public String toString() {
        return "Product Details -> "
                + "ID: " + id
                + ", Brand: " + brand
                + ", Name: " + name
                + ", Price: ₹" + price;
    }
}