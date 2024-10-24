package com.collageexam;
import java.util.Scanner;

class Item {
    int itemCode, price, quantity, totalPrice;
    String name;

    Item(int itemCode, int price, int quantity, String name) {
        this.itemCode = itemCode;
        this.price = price;
        this.quantity = quantity;
        this.name = name;
        this.totalPrice = price * quantity;
    }

    void display() {
        System.out.printf("%d\t\t%s\t\t%d\t\t%d\t\t%d\n", itemCode, name, price, quantity, totalPrice);
    }
}

public class ITEM_program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        Item[] items = new Item[n];

        // Input items
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Item " + (i + 1));
            System.out.print("Item Code: ");
            int itemCode = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            int price = sc.nextInt();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            items[i] = new Item(itemCode, price, quantity, name);
            System.out.println("Total Price: " + items[i].totalPrice);
        }

        // Sort items by total price in descending order
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (items[j].totalPrice < items[j + 1].totalPrice) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }

        // Display sorted items
        System.out.println("\n\nItem_code\tName\t\tPrice\t\tQuantity\tTotal_price");
        for (Item item : items) {
            item.display();
        }

        sc.close();
    }
}




