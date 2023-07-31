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
public class IncrementDecrementConversion {
        public static void main(String[] args) {
        int value1 = 1;
        int value2 = 1;

        // Increment
        value1++;
        System.out.println("First: " + value1);//increments the value after current value is used in the expression

        System.out.println("Second: " + value1++);//increments the value after current value is printed in the console

        System.out.println("Third: " + value1);//increments the value before its current value is used in the expression.

        System.out.println("First: " + (++value1));//increments the value before its current value is printed to the console.

        ++value2;
        value2++;
        System.out.println("First: " + value2);
    }
}
