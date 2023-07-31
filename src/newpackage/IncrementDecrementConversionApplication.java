package newpackage;
 import java.util.Scanner;


public class IncrementDecrementConversionApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalTasks = 10;
        int completedTasks = 0;
        int remainingTasks = totalTasks - completedTasks;

        System.out.println("Task Progress Tracker");
        System.out.println("Total Tasks: " + totalTasks);
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.println("Remaining Tasks: " + remainingTasks);

        while (completedTasks < totalTasks) {
            System.out.println("1. Increment Completed Tasks");
            System.out.println("2. Decrement Completed Tasks");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                completedTasks++;
            } else if (choice == 2) {
                if (completedTasks > 0) {
                    completedTasks--;
                } else {
                    System.out.println("Cannot decrement further. Completed tasks are already 0.");
                }
            } else if (choice == 3) {
                System.out.println("Exiting Task Progress Tracker.");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }

            remainingTasks = totalTasks - completedTasks;
            System.out.println("Updated Progress:");
            System.out.println("Completed Tasks: " + completedTasks);
            System.out.println("Remaining Tasks: " + remainingTasks);
        }
        scanner.close();
    }
}


