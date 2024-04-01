import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int sum = 0;
        int count = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Update smallest and largest numbers
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }

            // Update sum and count
            sum += number;
            count++;

            // Ask if the user wants to enter more numbers
            System.out.print("Do you want to enter more numbers? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        // Calculate average
        double average = (double) sum / count;

        // Display results
        System.out.println("Smallest number entered: " + smallest);
        System.out.println("Largest number entered: " + largest);
        System.out.println("Average of all numbers entered: " + average);

        scanner.close();
    }
}
