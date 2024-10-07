import java.util.Scanner;

class Account {
    private static int balance = 500; 

    public void credit(int amount) {  
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " is credited to your account.");
            System.out.println("Current balance: " + balance);
        } else {
            System.out.println("Invalid credit amount. Please enter a positive value.");
        }
    }

    public void debit(int amount) {  
        if (amount > 0 && balance - amount >= 500) { 
            balance -= amount;
            System.out.println(amount + " is debited.");
            System.out.println("Current balance: " + balance);
        } else {
            if (amount <= 0) {
                System.out.println("Invalid debit amount. Please enter a positive value.");
            } else {
                System.out.println("Insufficient funds. Minimum balance of 500 must be maintained.");
            }
        }
    }

    public void checkBalance() {
        System.out.println("Your current balance is: " + balance);
    }
}

public class AccountTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) { 
            System.out.println("\nAvailable actions:");
            System.out.println("1. Credit");
            System.out.println("2. Debit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            Account ac = new Account(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to credit: ");
                    int creditAmount = sc.nextInt();
                    ac.credit(creditAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to debit: ");
                    int debitAmount = sc.nextInt();
                    ac.debit(debitAmount);
                    break;
                case 3:
                    ac.checkBalance();
                    break;
                case 4:
                    System.out.println("Exiting account management system.");
                    sc.close(); 
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }
}