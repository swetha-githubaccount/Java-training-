import java.util.*;

class Student {
    int roll_no;
    String name;
    int age;
    String dept;
    String dateOfBirth;

    
    Student(int roll_no, String name, int age, String dept, String dateOfBirth) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.dateOfBirth = dateOfBirth;
    }

    void displayStudentDetails() {
        System.out.println("Roll number: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + dept);
        System.out.println("Date of Birth: " + dateOfBirth);
    }
}

public class ConstructorInputs
{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student details: ");
        Student s = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next());  

        System.out.println("\nStudent Details:");
        s.displayStudentDetails();

        sc.close();  
    }
}