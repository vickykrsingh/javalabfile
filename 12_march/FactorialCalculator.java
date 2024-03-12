public class FactorialCalculator {
    public static void main(String[] args) {
        int number = 5;
        long factorial = factorial(number);
        System.out.println("Factorial of " + number + " is: " + factorial);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1);
        }
    }
}