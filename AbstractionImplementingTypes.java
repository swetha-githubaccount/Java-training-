// i) Using Encapsulation
class Bank{
 static int balance = 1000;
    void credit(int amount)
    {
        balance += amount; 
        DBCreated();
    }
    void debit(int amount)
    {
        balance -= amount;
        DBCreated();
    }
    void balance(){
        System.out.println("Balance: " + balance);  
    }
    private void DBCreated(){
        System.out.println("DB is updated ");
    }
}

// ii) Using Abstract class
abstract class Vehicle{
    abstract void seatCount();
    abstract void fuelConsumption();
    abstract void security();
}

class Bike extends Vehicle{
    void seatCount(){
        System.out.println("1 seat , 2 members can sit");
    }
    void fuelConsumption(){
        System.out.println("It consumes less fuel");
    }
    void security(){
        System.out.println("Security is less");
    }
}
class Car extends Vehicle{
    void seatCount(){
        System.out.println("4 seats , 4 members can sit");
    }
    void fuelConsumption(){
        System.out.println("It consumes fuel higher than bike");
    }
    void security(){
        System.out.println("Security is very much better also it as air bag");
    }
}
class Truck extends Vehicle{
    void seatCount(){
        System.out.println("2 seats , but it can lift load");
    }
    void fuelConsumption(){
        System.out.println("It consumes more fuel than cars");
    }
    void security(){
        System.out.println("Security is not much");
    }
}

public class AbstractionImplementingTypes {
    public static void main(String[] args) {

    //i) Using encaptulation
    System.out.println("Abstraction using encaptulation (Bank example is used):");
    Bank bank = new Bank();
    bank.credit(10000);
    bank.debit(2000);
    bank.balance();


    System.out.println("--------------------------------------------------------------------------");
    // ii) Using abstraction class
        System.out.println("Abstraction using abstraction class (Vehicle example is used):");
        Bike b = new Bike();
        b.seatCount();
        b.fuelConsumption();
        b.security();

        Car c = new Car();
        c.seatCount();
        c.fuelConsumption();
        c.security();

        Truck t = new Truck();
        t.seatCount();
        t.fuelConsumption();
        t.security();
        System.out.println("--------------------------------------------------------------------------");

    }
}
