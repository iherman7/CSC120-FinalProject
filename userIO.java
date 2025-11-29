import java.util.Scanner;

public class userIO {

    public String output;

    public userIO(String output){
        this.output = output;
    }

    // method for reading user input 
    public String readInput(){
        Scanner mainScanner = new Scanner(System.in);
        String userInput = mainScanner.nextLine();
            
        if (userInput == "hi"){
            this.output = "hello";
        }

        mainScanner.close();
        return this.output;
    }

}
