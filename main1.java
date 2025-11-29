import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        int input;
        String output;
        userIO userIO = new userIO(1);
        System.out.println("hi, start game");
        input = userIO.readInput();
        output = userIO.setOutput(input);
        System.out.println(output);

    }
  

}
