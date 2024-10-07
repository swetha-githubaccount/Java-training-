
interface Shippable {
    void shipOrder();
}

class StandardShipping implements Shippable {
    
    public void shipOrder() {
        System.out.println("Standard Shipping: Order will arrive in 5-7 business days.");
    }
}


class ExpressShipping implements Shippable {
    
    public void shipOrder() {
        System.out.println("Express Shipping: Order will arrive in 1-2 business days.");
    }
}


public class EcommerceAbstraction {
    public static void main(String[] args) {
      
        Shippable standardOrder = new StandardShipping();
        Shippable expressOrder = new ExpressShipping();
        

        System.out.println("Processing orders:");
        standardOrder.shipOrder();
        expressOrder.shipOrder();
    }
}
