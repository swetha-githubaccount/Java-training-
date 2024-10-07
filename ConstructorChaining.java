class School {
    String name;
    int capacity;
    int pincode;
    boolean isCBSE;
    School() {
        System.out.println("Constructor created.");
    }
    School(String name) {
        this();
        this.name = name;
    }
    School(String name, int capacity) {
        this(name);
        this.capacity = capacity;
    }
    School(String name, int capacity, int pincode) {
        this(name, capacity);
        this.pincode = pincode;
    }
    School(String name, int capacity, int pincode, boolean isCBSE) {
        this(name, capacity, pincode);
        this.isCBSE = isCBSE;
    }
    void displaySchoolDetails() {
        System.out.println("School Name: " + name);
        System.out.println("Capacity: " + capacity);
        System.out.println("Pincode: " + pincode);
        System.out.println("Is CBSE: " + isCBSE);
    }
}

public class ConstructorChaining {
    public static void main(String args[]) {
        School s = new School();
        s.displaySchoolDetails();
        School s1 = new School("ABC");
        s1.displaySchoolDetails();
        School s2 = new School("EFG", 400);
        s2.displaySchoolDetails();
        School s3 = new School("ABC", 500, 604639);
        s3.displaySchoolDetails();
        School s4 = new School("ABC", 1000, 604207, true);
        s4.displaySchoolDetails();
        School s5 = s4;
        s5.displaySchoolDetails();
    }
}