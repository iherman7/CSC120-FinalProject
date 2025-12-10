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
        harborlane harborlane = new harborlane(player, playerLocation);
        // calmStreet calmStreet = new calmStreet(player, playerLocation);

        inputKey = alleyway.openingInput();
        outputString = alleyway.openingOutput(inputKey);
        System.out.println(outputString);

        // will eventually have to change loop to say while not quit or game won?
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

            // inside apt
            if (x == -1 && y == 2){
                inputKey = apartment.negOneTwoInput();
                outputString = apartment.negOneTwoOutput(inputKey);
                System.out.println(outputString);
            } 

            // housecat interaction 1
            if (x == -1 && y == 2){
                inputKey = apartment.negOneTwoInput();
                outputString = apartment.negOneTwoOutput(inputKey);
                System.out.println(outputString);
            } 

            // riddles
            if (x == -1 && y == 3){
                inputKey = apartment.riddle1Input();
                outputString = apartment.riddle1Output(inputKey);
                System.out.println(outputString);
            } 
            if (x == -1 && y == 4){
                inputKey = apartment.riddle2Input();
                outputString = apartment.riddle2Output(inputKey);
                System.out.println(outputString);
            }
            if (x == -1 && y == 5){
                inputKey = apartment.riddle3Input();
                outputString = apartment.riddle3Output(inputKey);
                System.out.println(outputString);
            }
            if (x == -1 && y == 6){
                inputKey = apartment.finalHousecatInput();
                outputString = apartment.finalHousecatOutput(inputKey);
                System.out.println(outputString);
            }

            //harbor lane entrance 
            if (x == 0 && y==2){
                inputKey = harborlane.zeroTwoInput();
                outputString = harborlane.zeroTwoOutput(inputKey);
                System.out.println(outputString);
            }

            // //crossroads
            // if (x == -2 && y == 0){
            //     inputKey = calmStreet.negTwoZeroInput();
            //     outputString = calmStreet.negTwoZeroOutput(inputKey);
            //     System.out.println(outputString);
            // }

            // //to park on calm street A
            // if (x==-2 && y==-1){
            //     inputKey = calmStreet.negTwoNegOneInput();
            //     outputString = calmStreet.negTwoNegOneOutput(inputKey);
            //     System.out.println(outputString);
            // }

            // //to park on calm street B
            // if (x==-2 && y == -2){
            //     inputKey = calmStreet.negTwoNegTwoInput();
            //     outputString = calmStreet.negTwoNegTwoOutput(inputKey);
            //     System.out.println(outputString);

            // }

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