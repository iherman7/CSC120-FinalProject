public class gameLoop{


    // method for start game dialogue


    public void runGame(){
        int input;
        String output;

        System.out.println("wake up!! wake up!!");
        
        IOtest openingScene = new IOtest();
        input = openingScene.scene1input();
        output = openingScene.scene1output(input);

        input = openingScene.scene2input();
        output = openingScene.scene2output(input);




        // IOtest test1 = new IOtest();
        // input = test1.scenario1();
        // output = test1.scenario1output(input);
        // System.out.println(output);

       
        // System.out.println("there is a street, you can travel north or south");
        // input = test1.scenario2();
        // output = test1.scenario2output(input);
        // System.out.println(output);
    }

    public static void main(String[] args) {
        gameLoop game = new gameLoop();
        game.runGame();

    }
}