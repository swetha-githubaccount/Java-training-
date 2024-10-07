class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class method");
        super.display(); // Calling the parent's display method
    }
}

public class OverridingSuper {
    public static void main(String[] args) {
        Child child = new Child();
        child.display();
    }
}