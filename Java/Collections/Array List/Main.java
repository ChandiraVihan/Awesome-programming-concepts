import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> integers = new ArrayList<>();

        int choice;

    while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. ADD");
            System.out.println("2. REMOVE");
            System.out.println("3. DISPLAY");
            System.out.println("4. EXIT");
            System.out.print("Choose your option: ");
            choice = input.nextInt();
        switch (choice) {
                case 1: // ADD
                    System.out.print("Enter number to add: ");
                    int numToAdd = input.nextInt();
                    if (!integers.contains(numToAdd)) {
                        integers.add(numToAdd);
                        System.out.println(numToAdd + " added.");
                    } else {
                        System.out.println(numToAdd + " is already in the list.");
                    }
                    break;

                case 2: // REMOVE
                    System.out.print("Enter number to remove: ");
                    int numToRemove = input.nextInt();
                    if (integers.contains(numToRemove)) {
                        integers.remove(Integer.valueOf(numToRemove)); // remove by value
                        System.out.println(numToRemove + " removed.");
                    } else {
                        System.out.println(numToRemove + " not found.");
                    }
                    break;

                case 3: // DISPLAY
                    System.out.println("Current list: " + integers);
                    break;

                case 4: // EXIT
                    System.out.println("Exiting program.");
                    return;

                default:
                    System.out.println("Invalid option. Try again.");

    }
}

    }
}