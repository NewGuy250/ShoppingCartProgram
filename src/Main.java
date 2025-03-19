import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Initialize Scanner obj
        Scanner scanner = new Scanner(System.in);

        // Initialize Variables
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;
        // Get inputs

        System.out.println("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.println("What is the price?: ");
        price = scanner.nextDouble();

        System.out.println("How many would you like?: ");
        quantity = scanner.nextInt();
        scanner.close();

        // Get total
        total = price * quantity;

        // Print results
        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);
    }
}