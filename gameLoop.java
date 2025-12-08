public class gameLoop{

    int inputKey;
    String outputString;

    private skeem player;
    private location playerLocation;

    public gameLoop(){
        this.player = new skeem();
        this.playerLocation = new location();
    }

    public void runGame(){
        
        System.out.println(" Wake up!! Wake up!!");
        
        alleyway alleyway = new alleyway(player, playerLocation);

        inputKey = alleyway.openingInput();
        outputString = alleyway.openingOutput(inputKey);
        System.out.println(outputString);
        
        inputKey = alleyway.zeroZeroInput();
        outputString = alleyway.zeroZeroOutput(inputKey);
        System.out.println(outputString);

        int x = playerLocation.getX();
        int y = playerLocation.getY();

        if (x == 1 && y == 0){
            gate gate = new gate(player, playerLocation);

             inputKey = gate.oneZeroInput();
             outputString = gate.oneZeroOutput(inputKey);
             System.out.println(outputString);
            // run (1, 0)
        }

        // if (playerLocation.getX() == 0 && playerLocation.getY() == 1){
        //     // run gate
        // }

        // if (playerLocation.getX() == -2 && playerLocation.getY() == 0){
        //     // run gate
        // }

        // the other stuff

        // gate
        // check player.hasKey (method within Skeem)
        // send boolean value to gate method that dictates the text response
        // hasKey = player.hasKey
        // oneZeroInput(hasKey)
    }

}