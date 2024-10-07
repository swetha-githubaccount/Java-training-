class Employee {
    int id, experience;
    String name, sector;
    float salary;
    Employee(int id, String name, String sector, float salary, int experience) {
        this.id = id;
        this.name = name;
        this.sector = sector;
        this.salary = salary;
        this.experience = experience;
    }
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Sector: " + sector);
        System.out.println("Salary: " + salary);
        System.out.println("Experience: " + experience + " years");
    }
}


public class EmployeeTask{
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee(101, "Abi", "IT", 55000, 5),
            new Employee(102, "Balaji", "Finance", 65000, 7),
            new Employee(103, "Anu", "HR", 60000, 6),
            new Employee(104, "David", "Marketing", 70000, 8)
        };

        Employee maxSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > maxSalaryEmployee.salary) {
                maxSalaryEmployee = employees[i];
            }
        }
        System.out.println("Employee with the maximum salary:");
        maxSalaryEmployee.displayDetails();
    }   
}