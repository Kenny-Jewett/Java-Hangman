import java.util.Scanner;

public class Guess {

    public static String guess;
    public static int guessesRemaining = 5;

    public static void setGuess(String guess) {
        Guess.guess = guess;
    }

    public static String getGuess() {
        return guess;
    }

    public static void setGuessesRemaining(int guessesRemaining) {
        Guess.guessesRemaining = guessesRemaining;
    }


    public static int getGuessesRemaining() {
        return guessesRemaining;
    }

    public static void collectInput() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Enter a letter to guess: ");
        String guess = scanner.nextLine();
        if(guess.length() > 1 || guess.isBlank()) {
            System.out.println("Only enter one letter!");
            collectInput();
        } else {
            setGuess(guess.toUpperCase());
            System.out.println("You guessed: " + getGuess());
        }

    }
}
