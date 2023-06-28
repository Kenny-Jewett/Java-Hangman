public class Hangman {

        private String hangman;

    public Hangman(String hangman) {
        this.hangman = hangman;
    }

    public String getHangman() {
        return hangman;
    }

    public void setHangman(String hangman) {
        this.hangman = hangman;
    }

    public void displayHangman(int guessesRemaining){

        switch(guessesRemaining) {
            case 4 :
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println(" ");
                System.out.println("_______");
                break;
            case 3 :
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 2 :
                System.out.println("   _______");
                System.out.println("   |/     |");
                System.out.println("   | ");
                System.out.println("   | ");
                System.out.println("   | ");
                System.out.println("   | ");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            case 1 :
                System.out.println("   _______");
                System.out.println("   |/     |");
                System.out.println("   |     (_)");
                System.out.println("   |     \\|/");
                System.out.println("   |   ");
                System.out.println("   |   ");
                System.out.println("   |");
                System.out.println("___|___");
                break;
            default :
                System.out.println("   _______");
                System.out.println("   |/     |");
                System.out.println("   |     (_)");
                System.out.println("   |     \\|/");
                System.out.println("   |      |");
                System.out.println("   |     / \\");
                System.out.println("   |");
                System.out.println("___|___");
                break;
        }
    }





}
