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
        
        System.out.println(" wake up!! wake up!!");
        
        alleyway alleyway = new alleyway(player, playerLocation);
        gate gate = new gate(player, playerLocation);
        apartment apartment = new apartment(player, playerLocation);

        inputKey = alleyway.openingInput();
        outputString = alleyway.openingOutput(inputKey);
        System.out.println(outputString);

        while (true){

            int x = playerLocation.getX();
            int y = playerLocation.getY();

            // (0, 0)
            if (x == 0 && y == 0){
                inputKey = alleyway.zeroZeroInput();
                outputString = alleyway.zeroZeroOutput(inputKey);
                System.out.println(outputString);
            }

            // (1, 0) in front of gate
            if (x == 1 && y == 0){
                inputKey = gate.oneZeroInput();
                outputString = gate.oneZeroOutput(inputKey);
                System.out.println(outputString);
            }

            // (-1, 0) alleyway in front of apt
            if (x == -1 && y == 0){
                inputKey = alleyway.negOneZeroInput();
                outputString = alleyway.negOneZeroOutput(inputKey);
                System.out.println(outputString);
            }

            // apt entrance
            if (x == -1 && y == 1){
                inputKey = apartment.negOneOneInput();
                outputString = apartment.negOneOneOutput(inputKey);
                System.out.println(outputString);
            }

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