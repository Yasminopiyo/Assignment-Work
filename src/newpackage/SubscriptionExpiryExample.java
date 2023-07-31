package newpackage;


import java.util.Random;

public class SubscriptionExpiryExample {
    public static void main(String[] args) {
        Random random = new Random();

        int daysUntilExpiration = random.nextInt(12);
        int discountPercentage = 0;

        if (daysUntilExpiration <= 0) {
            System.out.println("Your subscription has expired!");
        } else if (daysUntilExpiration == 1) {
            discountPercentage = 20;
            System.out.println("Your subscription expires within a day!");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 5) {
            discountPercentage = 10;
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Renew now and save " + discountPercentage + "%!");
        } else if (daysUntilExpiration <= 10) {
            System.out.println("Your subscription expires in: " + daysUntilExpiration + " days.");
            System.out.println("Your subscription will expire soon. Renew now!");
        }
    }
}


