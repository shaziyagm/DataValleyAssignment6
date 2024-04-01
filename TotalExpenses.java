import java.util.Scanner;

public class TotalExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Calculate total expenses without discount
        double totalExpenses = quantity * pricePerItem;

        // Apply discount based on the quantity purchased
        if (quantity > 50) {
            totalExpenses *= 0.9; // 10% discount
        } else if (quantity >= 25 && quantity <= 50) {
            totalExpenses *= 0.95; // 5% discount
        }

        System.out.println("Total expenses: Rs. " + totalExpenses);

        scanner.close();
    }
}
