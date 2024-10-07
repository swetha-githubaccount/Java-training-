final class Human {
    void display() {
        System.out.println("This is a final class.");
    }
}

//   class Person extends Human{} => Final class cannot be inherited.

final class Person {
    final void display() {
        System.out.println("This is a final method.");
    }
}

class Student {
    //final void display() {} cannot be override.
    void display() {
        System.out.println("This is a method in the Student class.");
    }
}

public class FinalMethodClass {
    public static void main(String[] args) {
        Human human = new Human();
        human.display();  // Calling method from the final class Human
        
        Person person = new Person();
        person.display();  // Calling final method from Person class
        
        Student student = new Student();
        student.display();  // Calling method from Student class
    }
}

/*
 * This code run correctly in online compiler.
 */