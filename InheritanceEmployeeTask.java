/*
encapsulation in employee class: develop an employee class with private fields fpr employee ID , name, salary.
provide public getter setter methods to access and modify those fields
*/
class Employee 
{
    private int employeeId;
    private String name;
    private float salary;

    public Employee(int employeeId, String name, float salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        if (salary >= 0) 
            this.salary = salary;
        else 
            System.out.println("Salary cannot be negative!");
    }
}
public class InheritanceEmployeeTask
{
    public static void main(String[] args) {
        Employee employee = new Employee(101, "John Doe", 50000);
        System.out.println("Employee ID: " + employee.getEmployeeId());  
        System.out.println("Name: " + employee.getName());              
        System.out.println("Salary: " + employee.getSalary());           

        // Modifying employee data
        employee.setSalary(60000);
        System.out.println("After updation:");
        System.out.println("Employee ID: " + employee.getEmployeeId());  
        System.out.println("Name: " + employee.getName()); 
        System.out.println("Updated Salary: " + employee.getSalary());   
        
        // Checking the salary constraints
        employee.setSalary(-1000);  
    }
}