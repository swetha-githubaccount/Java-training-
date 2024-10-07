class Parent {
    void speak() {
        System.out.println("Speaks only their mother tongue");
    }

    void work() {
        System.out.println("Doing agriculture");
    }
}

class Child extends Parent {
    void speak() {
        System.out.println("Speaks mother tongue and English");
    }

    void work() {
        System.out.println("Doing engineering");
    }

    void cook() {
        System.out.println("Cooks very well");
    }
}

public class Polymorphism {
    
    // Object pass as an argument to the function
    public static void objectAsArgument(Parent p) {
        p.speak();
        p.work();  
    }

    // Object returning function
    public static Parent getObject() {
        return new Child();  
    }

    public static void main(String[] args) {
        // Upcasting
        Parent p = new Child();
        p.speak();  
        System.out.println("----------------------------------------------");
        // Downcasting
        Child c = (Child) p;
        c.speak(); 
        c.cook();  
        System.out.println("----------------------------------------------");
        // Polymorphism
        Parent p1 = new Parent();
        Parent p2 = new Child();
        
        p1.work();  
        p2.work();  
        System.out.println("----------------------------------------------");
        // i) Passing an object as an argument to the function
        System.out.println("\nObject passed as argument:");
        objectAsArgument(p1);  
        objectAsArgument(p2);  
        System.out.println("----------------------------------------------");
        // ii) Object returning from a function
        System.out.println("\nObject returned from function:");
        Parent returnedObject = getObject();
        returnedObject.speak(); 
    }
}