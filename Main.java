
/**
 * Guessing Game
 *
 * @author Félix An
 * @version 1.0
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Main
{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        int secretNum = rand.nextInt(101);
        
        System.out.println("I have chosen a secret integer between 0 and 100. Guess what it is (type the number and press Enter): ");
        int userGuess = Integer.parseInt(br.readLine());
        
        System.out.println("The correct answer was " + secretNum);
        
        if (userGuess < 0 || userGuess > 100) {
            System.out.println("Guess between 0 and 100.");
        } else if (userGuess == secretNum) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }
}
