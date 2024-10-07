package AccessModifiers;
import AccessModifiers.*;
public class Main2 extends Main1 {
    public static void main(String[] args) {
        Main1 obj = new Main1(); 
        // Public
        System.out.println("Public: ");
        Main1.displayPublic();

        //Protected
        obj.displayString(); 

        // Default 
        //System.out.println("Default: " + display()); 

    }
}