/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Admin
 */
public class ArrayChallengeApplication {
  
    public static void main(String[] args) {
        // Suppose you have a list of all order IDs in your application
        String[] allOrderIds = {
            "B123", "C234", "A345", "C15", "B177", "G3003", "C235", "B179", "B888"
        };

        // Filter and process orders that start with "B"
        filterOrdersStartingWithB(allOrderIds);
    }

    public static void filterOrdersStartingWithB(String[] orderIds) {
        System.out.println("Orders starting with 'B':");
        for (String orderId : orderIds) {
            if (orderId.startsWith("B")) {
                System.out.println(orderId);
            }
        }
    }
}

    

