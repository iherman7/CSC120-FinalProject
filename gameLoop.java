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

            int a = playerLocation.getX();
            int b = playerLocation.getY();

            // (1, 0) in front of gate
            if (a == 1 && b == 0){
                inputKey = gate.oneZeroInput();
                outputString = gate.oneZeroOutput(inputKey);
                System.out.println(outputString);
            }

            int c = playerLocation.getX();
            int d = playerLocation.getY();

            // (-1, 0) alleyway in front of apt
            if (c == -1 && d == 0){
                inputKey = apartment.negOneOneInput();
                outputString = apartment.negOneOneOutput(inputKey);
                System.out.println(outputString);
            }

            int e = playerLocation.getX();
            int f = playerLocation.getY();

            // apt entrance
            if (e == -1 && f == 1){
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