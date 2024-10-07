import java.util.Scanner;

class Random { 

    int min = 0, max = 100;
    public Random() {
        this.rNumber = (int) (Math.random() * (max - min + 1)) + min;
    }

   int rNumber; 
    public void isRandom(int num) {
        if (rNumber == num) {
            System.out.println("Your guess is correct!");
        } 
        else if(rNumber > num) {
            System.out.println("The number is lesser than the generated number");
        }
        else
        {
            System.out.println("The number is greater than the generated number");
        }
    }
}

class RandomNumberTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r1 = new Random();
        int num;  

        do {
            num = sc.nextInt();
            r1.isRandom(num);
        } while (num != r1.rNumber);  
        sc.close();
    }
}