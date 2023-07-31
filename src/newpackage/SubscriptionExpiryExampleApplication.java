/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

 import java.util.Random;
import java.util.Scanner;

  

public class SubscriptionExpiryExampleApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int daysUntilExpiration = random.nextInt(30) + 1; // Assume the subscription lasts up to 30 days

        System.out.println("Welcome to Subscription Manager!");
        System.out.println("Days until subscription expiration: " + daysUntilExpiration);

        if (daysUntilExpiration <= 0) {
            System.out.println("Your subscription has expired!");
            System.out.println("Please renew your subscription to continue enjoying our service.");
        } else if (daysUntilExpiration == 1) {
            int discountPercentage = 20;
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + "%!");
            System.out.println("Enter 'renew' to extend your subscription: ");
            String renewOption = scanner.nextLine();
            if (renewOption.equalsIgnoreCase("renew")) {
                // Perform renewal process and apply the discount
                System.out.println("Subscription successfully renewed!");
            } else {
                System.out.println("Thank you for using our service!");
            }
        } else if (daysUntilExpiration <= 5) {
            int discountPercentage = 10;
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + "%!");
            System.out.println("Enter 'renew' to extend your subscription: ");
            String renewOption = scanner.nextLine();
            if (renewOption.equalsIgnoreCase("renew")) {
                // Perform renewal process and apply the discount
                System.out.println("Subscription successfully renewed!");
            } else {
                System.out.println("Your subscription will expire soon.");
            }
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
            System.out.println("Enter 'renew' to extend your subscription: ");
            String renewOption = scanner.nextLine();
            if (renewOption.equalsIgnoreCase("renew")) {
                // Perform renewal process
                System.out.println("Subscription successfully renewed!");
            } else {
                System.out.println("Your subscription is at risk of expiring.");
            }
        } else {
            System.out.println("Your subscription is active.");
            System.out.println("Enjoy our service!");
        }

        scanner.close();
    }
}
 

