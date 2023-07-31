package newpackage;

 import java.util.Scanner;


public class FarenheittoCelciusExApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the temperature in Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                double celsius = convertFahrenheitToCelsius(fahrenheit);
                System.out.println("The temperature is " + celsius + " degrees Celsius.");
            } else if (choice == 2) {
                System.out.print("Enter the temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = convertCelsiusToFahrenheit(celsius);
                System.out.println("The temperature is " + fahrenheit + " degrees Fahrenheit.");
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return ((fahrenheit - 32) * 5.0 / 9.0);
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
}


