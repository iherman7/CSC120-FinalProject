import java.util.Scanner;

public class gameLoop{

    public boolean gameRunning;
    public String gameResponse;

    public gameLoop(){

    }

    // method for start game dialogue

    // method for reading user input 
    public String readInput(){
        Scanner main = new Scanner(System.in);
        String userInput = main.nextLine(); 
        return userInput;
    }

    public static void main(String[] args) {
        skeem skeem = new skeem();
        // start game
        // read user input

        

    }
}