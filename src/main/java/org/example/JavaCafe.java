package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents the Java Cafe program.
 */
public class JavaCafe {
    private Scanner scanner = new Scanner(System.in);
    public List<String> order = new ArrayList<String>();

    /**
     * Runs the Java Cafe program. (Mauin menu)
     */
    public void run() {
        while(true) {
            System.out.println("Welcome to Java Cafe!");
            System.out.println("1. View Food Menu");
            System.out.println("2. View Drink Menu");
            System.out.println("3. View Dessert Menu");
            System.out.println("4. View Current Order");
            System.out.println("5. Remove Item from the Order");
            System.out.println("6. Exit");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                viewFoodMenu();
            } else if (choice.equals("2")) {
                viewDrinkMenu();
            } else if (choice.equals("3")) {
                viewDessertMenu();
            } else if (choice.equals("4")) {
                viewCurrentOrder();
            } else if (choice.equals("5")) {
                removeItem();
            } else if (choice.equals("6")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the food menu and allows the user to add items to the order.
     */
    public void viewFoodMenu() {
        while(true) {
            System.out.println("Food Menu");
            System.out.println("1. Sandwich");
            System.out.println("2. Salad");
            System.out.println("3. Soup");
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Sandwich");
            } else if (choice.equals("2")) {
                order.add("Salad");
            } else if (choice.equals("3")) {
                order.add("Soup");
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    /**
     * Displays the drink menu and allows the user to add items to the order.
     */
    public void viewDrinkMenu() {
        while(true) {
            System.out.println("Drink Menu");
            System.out.println("1. Coffee");
            System.out.println("2. Tea");
            System.out.println("3. Juice");
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Coffee");
            } else if (choice.equals("2")) {
                order.add("Tea");
            } else if (choice.equals("3")) {
                order.add("Juice");
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void viewDessertMenu() {
        while(true) {
            System.out.println("Dessert Menu");
            System.out.println("1. Tiramisu");
            System.out.println("2. Chocolate fondant");
            System.out.println("3. Red velvet cake");
            System.out.println("4. Return to Main Menu");

            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                order.add("Tiramisu");
            } else if (choice.equals("2")) {
                order.add("Chocolate fondant");
            } else if (choice.equals("3")) {
                order.add("Red velvet cake");
            } else if (choice.equals("4")) {
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    public void removeItem() {
        viewCurrentOrder();
        System.out.println("Which item do you want to remove? ");
        String item = scanner.next();
        if (order.contains(item)) {
            order.remove(item);
        } else {
            System.out.println(item + " was not found in the order.");
        }
    }
    /**
     * Displays the current order.
     */
    public void viewCurrentOrder() {
        System.out.println("Current Order:");
        for (String item : order) {
            System.out.println(item);
        }
    }
}
