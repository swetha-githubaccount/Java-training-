class Student{
    int rollno , age;
    String name , deptName;
    static int classTotal = 0;
    static String CollegeName = "SECE";
    
    Student(){
        System.out.println("Constructor is created.");
        classTotal++;
    }
    Student(int rollno)
    {
        this();
        this.rollno = rollno;
    }
    Student(int rollno , String name){
        this(rollno);
        this.name = name;
    }
    Student(int rollno, String name, String deptName)
    {
        this(rollno,name);
        this.deptName = deptName;
    }
    Student(int rollno, String name , String deptName,int age)
    {
        this(rollno,name,deptName);
        this.age = age;
    }
    Student(int rollno,String name, String deptName, int age, int classTotal)
    {
        this(rollno,name,deptName,age);
        this.classTotal = classTotal;
    }
    Student(int rollno,String name, String deptName, int age, int classTotal, String CollegeName)
    {
        this(rollno,name,deptName,age,classTotal);
        Student.classTotal = classTotal;  // Static variable
    }
    
    static void displayTotal()
    {
        System.out.println("Total Students: " + classTotal);   
    }
    void displayDetails()
    {
        System.out.println(rollno+" "+name+" "+deptName+" "+age+" "+classTotal+" "+CollegeName);
    }
}
class Task3StudentConstructor{
    public static void main(String args[])
    {
        Student s = new Student();
        s.displayDetails(); 
        Student s1 = new Student(123, "John", "CSE", 20);
        Student.displayTotal();
        s1.displayDetails();
        Student s2 = new Student(456, "Mary", "IT", 21 );
        Student s3 = new Student(s2.rollno, s2.name , s2.deptName);
        Student.displayTotal(); 
        s2.displayDetails();
    }
}