public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static float mul(float a, float b) {
        return a * b;
    }

    static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Addition: " + add(a, b));
        System.out.println("Subtraction: " + sub(a, b));
        System.out.println("Multiplication: " + mul(a, b));
        System.out.println("Division: " + div(a, b));
    }
}