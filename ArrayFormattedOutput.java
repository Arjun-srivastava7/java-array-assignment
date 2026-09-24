import java.util.Arrays;
import java.util.Scanner;

public class ArrayFormattedOutput {

    // Calculate sum
    public static int calculateSum(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }

    // Calculate average
    public static double calculateAverage(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        return (double) calculateSum(numbers) / numbers.length;
    }

    // Find largest number
    public static int findLargest(int[] numbers) {
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        return largest;
    }

    // Find smallest number
    public static int findSmallest(int[] numbers) {
        int smallest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return smallest;
    }

    // Sort the array
    public static int[] sortArray(int[] numbers) {
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);

        Arrays.sort(sortedNumbers);

        return sortedNumbers;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask user for number of elements
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();

        // Handle negative size
        if (size < 0) {
            System.out.println("Number of elements cannot be negative.");
            scanner.close();
            return;
        }

        // Create array
        int[] numbers = new int[size];

        // Take input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Handle empty list
        if (numbers.length == 0) {
            System.out.println("\nThe list is empty.");
            scanner.close();
            return;
        }

        // Calculate results
        int sum = calculateSum(numbers);
        double average = calculateAverage(numbers);
        int largest = findLargest(numbers);
        int smallest = findSmallest(numbers);
        int[] sortedNumbers = sortArray(numbers);

        // Display results using printf
        System.out.println("\n========== RESULTS ==========");

        System.out.printf("%-20s %s%n", "Calculation", "Result");
        System.out.printf("%-20s %s%n", "--------------------", "----------------");

        System.out.printf("%-20s %d%n", "Sum", sum);
        System.out.printf("%-20s %.2f%n", "Average", average);
        System.out.printf("%-20s %d%n", "Largest", largest);
        System.out.printf("%-20s %d%n", "Smallest", smallest);
        System.out.printf("%-20s %s%n", "Sorted values",
                Arrays.toString(sortedNumbers));

        scanner.close();
    }
}
