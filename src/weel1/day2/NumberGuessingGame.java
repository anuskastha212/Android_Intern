package week1.day2;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numberToGuess = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Guess a number between 1 and 100.");
        System.out.println("You have only 5 attempts.");

        while (attempts < 5) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess > numberToGuess) {
                System.out.println("Too high, try smaller number.");
            } else if (guess < numberToGuess) {
                System.out.println("Two low, try greater number.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                System.out.println("Number of attempts: " + attempts);
                break;
            }
        }

        if (guess != numberToGuess) {
            System.out.println("Game Over!");
            System.out.println("You used all 3 attempts.");
            System.out.println("The correct number was: " + numberToGuess);
        }

        scanner.close();
    }
}