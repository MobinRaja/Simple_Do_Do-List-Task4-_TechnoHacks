package calci;
import java.util.ArrayList;
import java.util.Scanner;

public class DO_LIST {
    public static void main(String[] args) {
        ArrayList<String> todoList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View items");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item to add: ");
                    String addItem = scanner.nextLine();
                    todoList.add(addItem);
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    if (!todoList.isEmpty()) {
                        System.out.println("Current items in the list:");
                        for (int i = 0; i < todoList.size(); i++) {
                            System.out.println((i + 1) + ". " + todoList.get(i));
                        }
                        System.out.print("Enter item number to remove: ");
                        int removeIndex = scanner.nextInt();
                        scanner.nextLine(); // Consume newline

                        if (removeIndex > 0 && removeIndex <= todoList.size()) {
                            String removedItem = todoList.remove(removeIndex - 1);
                            System.out.println("Removed: " + removedItem);
                        } else {
                            System.out.println("Invalid item number!");
                        }
                    } else {
                        System.out.println("List is empty! Nothing to remove.");
                    }
                    break;
                case 3:
                    if (!todoList.isEmpty()) {
                        System.out.println("===== TO-DO ITEMS =====");
                        for (String item : todoList) {
                            System.out.println("- " + item);
                        }
                    } else {
                        System.out.println("List is empty!");
                    }
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the to-do list. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a valid option.");
                    break;
            }
        }
        scanner.close();
    }
}
