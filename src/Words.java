import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Words{

    private static String currentWord;
    private List<String> wordList = new ArrayList<>();

    private ArrayList<String> wordArray = new ArrayList<>();

    private String wordDisplay;

    private ArrayList<String> wordDisplayArray = new ArrayList<>();

    public ArrayList getWordDisplayArray() {
        return wordDisplayArray;
    }

    public void setWordDisplayArray(ArrayList wordDisplayArray) {
        this.wordDisplayArray = wordDisplayArray;
    }

    public String getWordDisplay() {
        return wordDisplay;
    }

    public void setWordDisplay(String wordDisplay) {
        this.wordDisplay = wordDisplay;
    }

    public ArrayList<String> getWordArray() {
        return wordArray;
    }

    public void setWordArray(ArrayList<String> wordArray) {
        this.wordArray = wordArray;
    }

    public Words(String currentWord) {
        this.currentWord = currentWord;
    }

    public static String getCurrentWord() {
        return currentWord;
    }

    public List<String> getWordList() {
        return wordList;
    }

    public void setWordList(List<String> wordList) {
        this.wordList = wordList;
    }

    public void setCurrentWord(String currentWord) {
        this.currentWord = currentWord;
    }

    public String getRandomWord() {
        wordList.add("PICKLE");
        wordList.add("GARAGE");
        wordList.add("PLATE");
        double random = Math.random() * wordList.size();
        setCurrentWord(wordList.get((int)random));
        return currentWord;

    }

    public void splitWord(String word) {
        String[] splitWord = word.split("");
        for(int i = 0; i < word.length(); i++) {
            wordArray.add(splitWord[i]);
        }
        setWordArray(wordArray);
    }

    public void replaceLetter(ArrayList wordArray, ArrayList wordDisplayArray, String guess) {
        ArrayList replaced = wordDisplayArray;
       for(int i = 0; i < wordArray.size(); i++) {
           if(wordArray.get(i).equals(guess)){
              replaced.set(i, guess);
           }

       }setWordDisplayArray(replaced);
    }

    public void hiddenWord(String word) {
        String dash = "";
        for (int i = 0; i < word.length(); i++) {
            dash = dash.concat("_");
        } setWordDisplay(dash);
    }

    public void hiddenWordArray(String word) {
        String[] wordArray = word.split("");
        for(int i = 0; i < wordArray.length; i++) {
            wordDisplayArray.add(wordArray[i]);
        }
    }

    public String convertArrayToString(ArrayList wordArray) {
        String word = "";
        for(int i = 0; i < wordArray.size(); i++) {
            word = word.concat(wordArray.get(i).toString());
        } return word;
    }

}
