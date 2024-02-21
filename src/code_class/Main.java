package code_class;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input customer name: ");
        String customerName = sc.nextLine();
        System.out.print("input customer type (\nPremium\nGold\nSilver\nNormal\n): ");
        String customerType = sc.nextLine();
        Customer customer = new Customer(customerName, customerType);
        System.out.print("Enter service expense:");
        double serviceExpense = sc.nextDouble();
        System.out.print("Enter product expense:");
        double productExpense = sc.nextDouble();
        Sale sale = new Sale(customer, serviceExpense, productExpense);
        sale.displayInfo();
    }
}