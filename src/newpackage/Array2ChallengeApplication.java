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
public class Array2ChallengeApplication {
    private String orderId;
    private String itemName;
    private double price;

    public Array2ChallengeApplication(String orderId, String itemName, double price) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Item: " + itemName + ", Price: $" + price;
    }
    
}
