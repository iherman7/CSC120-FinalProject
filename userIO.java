import java.util.Scanner;

public class userIO {

    public int inputKey;
    public String output;

    public userIO(int inputKey){
        inputKey = 1;
    }

    // method for reading user input 
    public int readInput(){
        Scanner mainScanner = new Scanner(System.in);
        String userInput = mainScanner.nextLine();
        
        String case1 = "hi";
        String case2 = "bye";
        String case3 = "help";

        if (userInput == case1){
            return 1;
        }
        if (userInput == case2){
            return 2;
        }
        if (userInput == case3){
            return 3;
        } else {
            return 0;
        }
    }

    public String setOutput(int inputKey){
        if (inputKey == 1){
            return "hello";
        }
        if (inputKey == 2){
            return "goodbye";
        }
        if (inputKey == 3){
            return "ok";
        } else {
            return "i don't understand";
        }
    }

    public static void main(String[] args) {
        userIO userIO = new userIO(1);
        System.out.println("hi, start game");
        int input = userIO.readInput();
        String output = userIO.setOutput(input);
        System.out.println(output);
    }

}
