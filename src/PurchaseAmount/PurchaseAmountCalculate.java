package PurchaseAmount;

import java.util.List;

public class PurchaseAmountCalculate {

    public static double calculateTotalAmountWithDiscount(List<Item> items, double discountPercentage) {
        double totalAmount = 0;

        // Calculate total amount before applying discount
        for (Item item : items) {
            totalAmount += item.getTotalPrice();
        }

        // Apply discount
        double discountAmount = (discountPercentage / 100) * totalAmount;
        double discountedTotal = totalAmount - discountAmount;

        return discountedTotal;
    }

    public static void main(String[] args) {
        // Create items and their quantities
        Item item1 = new Item("Item 1", 10.0, 2);
        Item item2 = new Item("Item 2", 20.0, 1);
        Item item3 = new Item("Item 3", 15.0, 3);

        // Add items to the order
        List<Item> items = List.of(item1, item2, item3);

        // Customer's discount percentage
        double discountPercentage = 10.0;

        // Calculate and print the total amount with discount
        double totalAmountWithDiscount = calculateTotalAmountWithDiscount(items, discountPercentage);
        System.out.println("Total amount with " + discountPercentage + "% discount: $" + totalAmountWithDiscount);
    }
}
