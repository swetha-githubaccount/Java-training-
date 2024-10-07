import java.util.*;

class Student 
{
    int roll_no;
    String name;
    int age;
    String dept;
    String dateOfBirth;
    // Using getter setter function.

   /*void setStudentDetails(int roll_no, String name, int age, String dept, String dateOfBirth) {
        this.roll_no = roll_no;
        this.name = name;
        this.age = age;
        this.dept = dept;
        this.dateOfBirth = dateOfBirth;
    }
        */


// Constructor
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

public class StudentTask {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Student s = new Student();

        //System.out.print("Enter Student details: ");
        //s.setStudentDetails(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next()); 


        //constructor
        System.out.print("Enter Student details: ");
        Student s = new Student(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next());  

        System.out.println("\nStudent Details:");
        s.displayStudentDetails();
        
        sc.close();  
    }
}