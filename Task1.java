import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int rounds = 0;

        while (true) {
            int guessednumber = random.nextInt(100) + 1;
            int numberOfTries = 0;
            boolean winner = false;

            System.out.println("Round " + (rounds + 1));
            System.out.println("Guess a number between 1 and 100:");

            while (numberOfTries < 5) {
                int guess = scanner.nextInt();
                numberOfTries++;

                if (guess < guessednumber) {
                    System.out.println("Too low, try again!");
                } else if (guess > guessednumber) {
                    System.out.println("Too high, try again!");
                } else {
                    System.out.println("Yes, you guessed the number!");
                    winner = true;
                    score += 10 - numberOfTries;
                    break;
                }
            }

            if (!winner) {
                System.out.println("oops! attempts exceeded,  The number was " + guessednumber);
            }

            System.out.println("Your current score is " + score);
            System.out.println("Do you want to play again? (yes/no)");
            scanner.nextLine(); 
            String response = scanner.nextLine();

            if (!response.equalsIgnoreCase("yes")) {
                break;
            }

            rounds++;
        }

        System.out.println("Thanks for playing! Your final score is " + score);
    }
}