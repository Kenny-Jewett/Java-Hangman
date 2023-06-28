import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Words word = new Words("");
        word.getRandomWord();
        word.splitWord(Words.getCurrentWord());
        System.out.println(word.getCurrentWord());
        Hangman hangman = new Hangman("blank", "");
        word.hiddenWord(Words.getCurrentWord());
        word.hiddenWordArray(word.getWordDisplay());
        System.out.println(word.getWordDisplayArray());
        System.out.println(word.getWordDisplay());
        System.out.println(Guess.guessesRemaining);
        System.out.println(word.getWordArray());



        while(Guess.guessesRemaining > 0) {
            Guess.collectInput();
            if (word.getWordArray().equals(word.getWordDisplayArray())) {
                System.out.println("You won!");
            } else if (Words.getCurrentWord().contains(Guess.getGuess())){
                word.replaceLetter(word.getWordArray(), word.getWordDisplayArray(), Guess.getGuess());
                System.out.println(word.getWordDisplayArray());
            }else {

                System.out.println("Wrong! You lose one life!");
                Guess.decrementGuesses();
                System.out.println("You have " + Guess.guessesRemaining + " guesses remaining.");
            }



        }



    }
}