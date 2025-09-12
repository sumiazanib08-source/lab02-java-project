// App.java
public class App {
    public static void main(String[] args) {
        // Create products using different constructors
        Product product1 = new Product(); // Default constructor
        Product product2 = new Product("Laptop", 101, 899.99, true); // Parameterized constructor

        // Display initial details
        System.out.println("Initial Product Details:");
        product1.display();
        product2.display();

        // Update attributes using setters
        product1.setName("Mouse");
        product1.setId(102);
        product1.setPrice(25.50);
        product1.setInStock(true);

        product2.setPrice(849.99); // Update price

        // Display details after updates
        System.out.println("Updated Product Details:");
        product1.display();
        product2.display();
    }
}