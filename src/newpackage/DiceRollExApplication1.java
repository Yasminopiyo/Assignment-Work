package newpackage;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class DiceRollExApplication1 {
    public static void main(String[] args) {
        playDiceGame();
    }

    public static void playDiceGame() {
        Random random = new Random();

        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(101);
        int roll3 = random.nextInt(51) + 50;

        System.out.println("First roll: " + roll1);
        System.out.println("Second roll: " + roll2);
        System.out.println("Third roll: " + roll3);

        int total = roll1 + roll2 + roll3;

        System.out.println("Dice roll: " + roll1 + " + " + roll2 + " + " + roll3);

        if (roll1 == roll2 && roll2 == roll3) {
            System.out.println("You rolled triples! +6 bonus to total!");
            total += 6;
        } else if (roll1 == roll2 || roll2 == roll3 || roll1 == roll3) {
            System.out.println("You rolled doubles! +2 bonus to total!");
            total += 2;
        }

        int targetScore = 15;
        System.out.println("Your total score: " + total);

        if (total >= targetScore) {
            System.out.println("Congratulations! You win!");
        } else {
            System.out.println("Sorry, you lose. Try again!");
        }
    }
}
 
    
    

