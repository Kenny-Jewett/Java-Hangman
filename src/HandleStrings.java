import java.util.ArrayList;

public interface HandleStrings {

    public String getRandomWord();

    public void splitWord(String word);

    public void replaceLetter(ArrayList wordArray, ArrayList wordDisplayArray, String guess);

    public void hiddenWord(String word);


    public void hiddenWordArray(String word);

    public String convertArrayToString(ArrayList wordArray);






}
