import java.util.*;

public class NthPrimeNumber 
{
    void nPrime(int n) {
        int[] primes = new int[n];  
        int count = 0;  
        int num = 2;  

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;  
                count++;
            }
            num++;  
        }
        System.out.println(n + "th prime number is: " + primes[n-1]);
    }

    boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true;  
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        NthPrimeNumber obj = new NthPrimeNumber();
        obj.nPrime(n); 
        sc.close();
    }
}
