import java.util.Scanner;

public class sumandavg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / size; // Calculate average
        System.out.println("Sum of the array elements: " + sum);
        System.out.println("Average of the array elements: " + average);
        sc.close();
    }
}
