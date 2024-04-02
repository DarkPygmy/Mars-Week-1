import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MarsDay3 {

    private final int maxNumber = 100;
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private String playerName;
    private int targetNumber;
    private int numberOfTries;

    public MarsDay3() {
        greetPlayer();
        this.targetNumber = random.nextInt(maxNumber) +1;
        playGame();
    }

    private void greetPlayer() {
        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name)");
        playerName = scanner.nextLine();
        System.out.println(playerName + ", I'm thinking of a number between 1 and 100.");
        System.out.println("Can you guess what the number is?");
    }

    private void playGame() {
        while (true) {
            System.out.println("Enter your guess:");
            int guess = getValidGuess();
            if (processGuess(guess)) {
                break;
            }
        }

    }

    private int getValidGuess() {
        while (true) {
            try {
                int guess = scanner.nextInt();
                if (guess < 1 || guess > maxNumber) {
                    System.out.println(guess + " is not a valid number, try again.");
                } else {
                    return guess;
                }
            } catch (InputMismatchException e) {
                System.out.println("That's not an integer, try again");
                scanner.next();
            }
        }
    }

    private boolean processGuess(int guess) {
        numberOfTries++;
        if (guess < targetNumber) {
            System.out.println("Your guess is too low, try again.");
            return false;
        } else if (guess > targetNumber) {
            System.out.println("Your guess is too high, try again.");
            return false;
        } else {
            System.out.println("Well done, " + playerName + "!");
            System.out.println("You found my number in " + numberOfTries + " tries!");
            return true;

        }
    }

    public static void main(String[] args) {
        new MarsDay3();
    }
}