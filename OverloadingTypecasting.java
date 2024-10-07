class Ecommerse {
    int productId;
    String productName;
    float cost;

    // Constructor overloading
    Ecommerse() {
        System.out.println("Object is created for E-commerce.");
    }

    Ecommerse(int productId) {
        this.productId = productId;
        System.out.println("Constructor with productId: " + productId);
    }

    Ecommerse(int productId, String productName) {
        this(productId);
        this.productName = productName;
        System.out.println("Constructor with productId and productName: " + productName);
    }

    Ecommerse(int productId, String productName, float cost) {
        this(productId, productName);
        this.cost = cost;
        System.out.println("Constructor with productId, productName, and cost: " + cost);
    }
    void display() {
        System.out.println("Product ID: " + productId + ", Product Name: " + productName + ", Cost: " + cost);
    }
    //Method overloading
    void addElement(int productId) {
        this.productId = productId;
        System.out.println("Product ID is added: " + productId);
    }

    void addElement(String productName) {
        this.productName = productName;
        System.out.println("Product name is added: " + productName);
    }

    void addElement(int productId, String productName) {
        this.productId = productId;
        this.productName = productName;
        System.out.println("Product ID and product name both are added: " + productId + ", " + productName);
    }
    void addCost(double cost) {
        this.cost = (float) cost;
        System.out.println("Product cost added (double to float): " + this.cost);
    }

    void addCost(int cost) {
        this.cost = cost;  
        System.out.println("Product cost added (int to float): " + this.cost);
    }
}

public class OverloadingTypecasting {
    public static void main(String[] args) {
        // Constructor overloading
        Ecommerse e1 = new Ecommerse(1, "Pen", 10.00f);
        e1.display();
        
        // Method overloading
        e1.addElement(2);
        e1.addElement("Notebook");
        e1.addElement(3, "Marker");
        e1.display();

        // Typecasting example for adding cost
        e1.addCost(100);  // int to float
    }
}