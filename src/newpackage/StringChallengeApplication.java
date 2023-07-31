/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;
 import java.util.Scanner;


public class StringChallengeApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Word Reversal Practice!");

        while (true) {
            System.out.print("Enter a sentence (or type 'exit' to quit): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Word Reversal Practice.");
                break;
            }

            String[] words = input.split(" ");

            System.out.println("Word Reversal Practice:");
            for (String word : words) {
                String reversedWord = reverseWord(word);
                System.out.println("Reversed: " + reversedWord);
            }
        }

        scanner.close();
    }

    private static String reverseWord(String word) {
        char[] characters = word.toCharArray();
        int start = 0;
        int end = characters.length - 1;

        while (start < end) {
            char temp = characters[start];
            characters[start] = characters[end];
            characters[end] = temp;
            start++;
            end--;
        }

        return new String(characters);
    }
}


