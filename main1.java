import java.util.Scanner;

public class main1 {

    public static void main(String[] args) {
        int input;
        String output;
        userIO userIO = new userIO(1);
        System.out.println("hi, start game");
        // input = userIO.readInput();
        // output = userIO.setOutput(input);

        IOtest test1 = new IOtest();
        input = test1.scenario1();
        output = test1.scenario1output(input);

        System.out.println(output);

       
        System.out.println("there is a street, you can travel north or south");
        input = test1.scenario2();
        output = test1.scenario2output(input);

        System.out.println(output);

    }

}
