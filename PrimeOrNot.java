class Prime
{
    void isPrime(int n) 
    {
        if (n <= 1) {
            System.out.println(n + " is not a prime number.");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i <= n / 2; i++) 
        {
            if (n % i == 0) 
            {
                isPrime = false;
                break; 
            }
        }

        if (isPrime)
            System.out.println(n + " is a prime number.");
        else
            System.out.println(n + " is not a prime number.");
    }
}


public class PrimeOrNot 
{
    public static void main(String[] args) 
    {        
        Prime obj = new Prime();
        obj.isPrime(8); 
    }
}