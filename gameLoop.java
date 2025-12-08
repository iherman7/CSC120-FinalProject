public class gameLoop{

    public void runGame(){
        int input;
        String output;

        skeem player = new skeem();

        System.out.println(" Wake up!! Wake up!!");
        
        alleyway alleyway = new alleyway(player);
        input = alleyway.openingInput();
        output = alleyway.openingOutput(input);
        System.out.println(output);

        input = alleyway.zeroZeroInput();
        output = alleyway.zeroZeroOutput(input);
        System.out.println(output);




        // IOtest test1 = new IOtest();
        // input = test1.scenario1();
        // output = test1.scenario1output(input);
        // System.out.println(output);

       
        // System.out.println("there is a street, you can travel north or south");
        // input = test1.scenario2();
        // output = test1.scenario2output(input);
        // System.out.println(output);
    }

    // public static void main(String[] args) {
    //     gameLoop game = new gameLoop();
    //     skeem player = new skeem();
    //     game.runGame();

    // }
}