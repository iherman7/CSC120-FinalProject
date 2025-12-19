import java.util.Scanner;
/**
 * This class allows the program to take in and read user input.
 */
public class userIO {
    /**
     * Attributes
     */
    public int inputKey;
    public String output;
    private static final Scanner mainScanner = new Scanner(System.in);

    /**
     * Empty constructor
     */
    public userIO(){
    }

    /**
     * Takes user input using Scanner, changes it to all caps, and returns it.
     * Also takes care of quit function if user input is "Q"
     * @return fixeduserInput the user's input set to all caps
     */
    public String readInput(){
        String userInput = mainScanner.nextLine();
        String fixeduserInput = userInput.toUpperCase();

        if (fixeduserInput.equals("Q")){
            System.out.println("\n you tucked your little tail between your legs and decied to take a swim in the beautiful ocean.\n");
            mainScanner.close();
            System.exit(0);
        }

        return fixeduserInput;
    }

    /**
     * Closes Scanner
     */
    public static void closeScanner(){
        mainScanner.close();
    }

}