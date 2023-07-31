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
public class FarenheittoCelciusEx {
    public static void main(String[] args) {
        int fahrenheit = 60;
        double temperature = ((fahrenheit - 32) * 5.0 / 9.0);
        System.out.println("The temperature is " + temperature + " degree Celsius");

        int fahrenheit2 = 60;
        double temperature2 = ((fahrenheit2 - 32.0) * 5.0 / 9.0);
        System.out.println("The temperature is " + Math.round(temperature2) + " degree Celsius");
    }
}

