import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {




        Words word = new Words("");
        word.getRandomWord();
        word.splitWord(Words.getCurrentWord());
        Hangman hangman = new Hangman("");
        word.hiddenWord(Words.getCurrentWord());
        word.hiddenWordArray(word.getWordDisplay());
        System.out.println(word.getWordArray());
        Guess.setGuessesRemaining(5);
        Guess.setLettersGuessed("");



        while(Guess.getGuessesRemaining() >= 0) {
            hangman.displayHangman(Guess.getGuessesRemaining());
            word.convertArrayToString(word.getWordDisplayArray());
            System.out.println("Guess this word : " + word.convertArrayToString(word.getWordDisplayArray()));
            System.out.println("You've guessed: " + Guess.getLettersGuessed());
            Guess.collectInput();
            if (word.getWordArray().equals(word.getWordDisplayArray())) {
                System.out.println("You won!");
                Guess.restartGame();
                Main.main(args);
            } else if (Words.getCurrentWord().contains(Guess.getGuess())){
                word.replaceLetter(word.getWordArray(), word.getWordDisplayArray(), Guess.getGuess());
            } else if (Guess.getGuessesRemaining() == 0) {
                hangman.displayHangman(Guess.getGuessesRemaining());
                System.out.println("You've lost!");
                Guess.restartGame();
                Main.main(args);
            } else {
                Guess.displayLetters(Guess.getGuess());
                System.out.println("Wrong! You lose one life!");
                Guess.decrementGuesses();
                System.out.println("You have " + Guess.getGuessesRemaining() + " guesses remaining.");
            }



        }



    }
}