// Product.java
public class Product {
    // Attributes with different types
    private String name;
    private int id;
    private double price;
    private boolean inStock;

    // Default constructor
    public Product() {
        this.name = "Unknown";
        this.id = 0;
        this.price = 0.0;
        this.inStock = false;
    }

    // Parameterized constructor
    public Product(String name, int id, double price, boolean inStock) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.inStock = inStock;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    // Display method to print product details
    public void display() {
        System.out.println("Product Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Price: $" + price);
        System.out.println("In Stock: " + (inStock ? "Yes" : "No"));
        System.out.println("---------------------");
    }
}