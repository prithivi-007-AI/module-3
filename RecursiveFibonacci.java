import java.util.Scanner;

public class RecursiveFibonacci {

    // Recursive method to find nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case
        } else if (n == 1) {
            return 1; // Base case
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Calculate the nth Fibonacci number using recursion.");
        int n = -1;

        // Input validation loop
        while (n < 0) {
            System.out.print("Enter a positive integer (n >= 0): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 0) {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: That's not an integer. Try again.");
                scanner.next();
            }
        }
        scanner.close();

        int result = fibonacci(n);
        System.out.printf("The %d%s Fibonacci number is: %d%n", n, getOrdinalSuffix(n), result);
    }
    private static String getOrdinalSuffix(int n) {
        if (n % 100 >= 11 && n % 100 <= 13) {
            return "th";
        }
        switch (n % 10) {
            case 1:  return "st";
            case 2:  return "nd";
            case 3:  return "rd";
            default: return "th";
        }
    }
}

