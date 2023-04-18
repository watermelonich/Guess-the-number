import java.util.Random;
import java.util.Scanner;

public class nguess {
    
    public static void main(String[] args) {
        // random number generator
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        
        // number of guesses allowed
        int maxGuesses = 5;
        
        Scanner scanner = new Scanner(System.in);
        
        // Game loop
        for (int i = 1; i <= maxGuesses; i++) {
            // Prompt the user for a guess
            System.out.print("Guess #" + i + ": ");
            int guess = scanner.nextInt();
            
            // Check if the guess is correct
            if (guess == numberToGuess) {
                System.out.println("Congratulations, you guessed the number!");
                return;
            } else if (guess < numberToGuess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("Too high, try again.");
            }
        }
        
        // If loop completes without a correct guess, the player loses
        System.out.println("Sorry, you didn't guess the number. The number was " + numberToGuess + ".");
    }
}
