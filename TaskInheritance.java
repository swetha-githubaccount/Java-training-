import java.util.Arrays;

class Person {
    static int rollnoCounter = 0; 
    int rollno;  
    String name;
    Person(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Roll No: " + rollno +","+ " Name: " + name);
    }
}

public class TaskInheritance {
    public static void main(String[] args) {
        Person persons[] = new Person[5];

        persons[0] = new Person("John");
        persons[1] = new Person("Alice");
        persons[2] = new Person("Bob");
        persons[3] = new Person("David");
        persons[4] = new Person("Charlie");
        Arrays.sort(persons, (a, b) -> a.name.compareTo(b.name));
        for (int i = 0; i < persons.length; i++) {
            persons[i].rollno = i + 1;  
        }
        for (Person person : persons) {
            person.display();
        }
    }
}
