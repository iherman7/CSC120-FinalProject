import java.util.Scanner;

public class userIO {

    public int inputKey;
    public String output;

    public userIO(){
    }

    // method for reading user input 
    public String readInput(){
        Scanner mainScanner = new Scanner(System.in);
        String userInput = mainScanner.nextLine();

        String fixeduserInput = userInput.toUpperCase();
        return fixeduserInput;
        
    }

}