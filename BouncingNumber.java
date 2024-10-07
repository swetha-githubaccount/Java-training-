import java.util.Scanner;

public class BouncingNumber {
    public static boolean isIncreasing(int num) {
        int prev = num % 10;
        num /= 10;
        while (num > 0) {
            int current = num % 10;
            if (current > prev) {
                return false;
            }
            prev = current;
            num /= 10;
        }
        return true;
    }
    public static boolean isDecreasing(int num) {
        int prev = num % 10;
        num /= 10;
        while (num > 0) {
            int current = num % 10;
            if (current < prev) {
                return false;
            }
            prev = current;
            num /= 10;
        }
        return true;
    }
    public static boolean isBouncing(int num) {
        return !(isIncreasing(num) || isDecreasing(num));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (isBouncing(number)) {
            System.out.println(number + " is a bouncing number.");
        } else {
            System.out.println(number + " is not a bouncing number.");
        }

        scanner.close();
    }
}