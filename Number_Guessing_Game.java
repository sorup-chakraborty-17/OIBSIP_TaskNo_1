import java.util.Scanner;                        // Sorup Chakraborty
import java.util.Random;

public class Number_Guessing_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int secretNumber, guess, maxNumber, maxAttempts, attempts, score;
        char playAgain;
        System.out.println("The Start of the game !!!\n");
        do {
            score = 0;
            attempts = 0;
            System.out.print("Please enter the maximum number that you want to guess (E.g. -> 100): ");
            maxNumber = sc.nextInt();
            secretNumber = rand.nextInt(maxNumber) + 1;
            System.out.print("Please enter the maximum number of attempts you want to have (E.g. -> 5): ");
            maxAttempts = sc.nextInt();

            do {
                attempts++;
                System.out.print("Guess #" + attempts + ": ");
                guess = sc.nextInt();

                if (guess == secretNumber) {
                    System.out.println("Congratulations! You guessed the secret number -> " + secretNumber + " in ->" + attempts + " attempt(s).");
                    score = maxAttempts - attempts + 1;
                    System.out.println("Your score is " + score + " points.");
                } else if (guess < secretNumber) {
                    System.out.println("Your guess is too low !");
                } else {
                    System.out.println("Your guess is too high !");
                }
            } while (guess != secretNumber && attempts < maxAttempts);

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you ran out of attempts. The secret number was " + secretNumber + ".");
            }

            System.out.print("Do you want to play again? (y/n)\n ");
            playAgain = sc.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
        System.out.println("Thank You for playing !!!");

        sc.close();
    }
}
