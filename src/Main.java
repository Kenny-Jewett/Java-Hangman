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

        for(int i = 5; i > 0; i--) {
            Guess.collectInput();

            word.replaceLetter(word.getWordArray(), word.getWordDisplayArray(), Guess.getGuess());
            System.out.println(word.getWordDisplayArray());

//            if(Words.getCurrentWord().contains(Guess.getGuess())){
//
//            }

        }



    }
}