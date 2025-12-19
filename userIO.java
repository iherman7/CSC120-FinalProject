import java.util.Scanner;

public class userIO {

    public int inputKey;
    public String output;
    private static final Scanner mainScanner = new Scanner(System.in);

    public userIO(){
    }

    // method for reading user input 
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

    public static void closeScanner(){
        mainScanner.close();
    }

}