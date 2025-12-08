public class gameLoop{

    public void runGame(){
        int input;
        String output;

        skeem player = new skeem();
        location playerLocation = new location();

        System.out.println(" Wake up!! Wake up!!");
        
        alleyway alleyway = new alleyway();

        input = alleyway.openingInput();
        output = alleyway.openingOutput(input);
        System.out.println(output);
        
        input = alleyway.zeroZeroInput();
        output = alleyway.zeroZeroOutput(input);
        System.out.println(output);

        if (playerLocation.getX() == -1 && playerLocation.getY() == 0){
            // run (-1, 0)
            System.out.println("went west");
        }

        if (playerLocation.getX() == 0 && playerLocation.getY() == 1){
            // run gate
        }

        if (playerLocation.getX() == -2 && playerLocation.getY() == 0){
            // run gate
        }

        // the other stuff

        // gate
        // check player.hasKey (method within Skeem)
        // send boolean value to gate method that dictates the text response


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