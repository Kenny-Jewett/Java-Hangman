import java.util.Scanner;

public class Guess {

    private static String guess;
    private static int guessesRemaining = 5;

    public static String getLettersGuessed() {
        return lettersGuessed;
    }

    public static void setLettersGuessed(String lettersGuessed) {
        Guess.lettersGuessed = lettersGuessed;
    }

    public static String lettersGuessed = "";

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

    public static void restartGame() {
        Scanner scanner = new Scanner((System.in));
        System.out.println("Press any key to play again.");
        scanner.nextLine();
    }

    public static void decrementGuesses() {
        setGuessesRemaining(guessesRemaining - 1);
    }

    public static String displayLetters(String letter) {
        setLettersGuessed(lettersGuessed.concat(letter));
        return getLettersGuessed();
    }


}
