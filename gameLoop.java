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
        
        System.out.println("\n wake up!! wake up!!\n");
        
        alleyway alleyway = new alleyway(player, playerLocation);
        gate gate = new gate(player, playerLocation);
        apartment apartment = new apartment(player, playerLocation);
        harborlane harborlane = new harborlane(player, playerLocation);
        calmStreet calmStreet = new calmStreet(player, playerLocation);
        park park = new park(player, playerLocation);
        fishmarketA fishmarketA = new fishmarketA(player, playerLocation);
        fishmarketB fishmarketB = new fishmarketB(player, playerLocation);
        busyRoad busyRoad = new busyRoad(player, playerLocation);

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
                // riddles
                if (apartment.housecatConvo = true){
                        inputKey = apartment.riddle1Input();
                        outputString = apartment.riddle1Output(inputKey);
                        System.out.println(outputString);
                            if (apartment.riddle1Answered = true){
                                inputKey = apartment.riddle2Input();
                                outputString = apartment.riddle2Output(inputKey);
                                System.out.println(outputString);
                            }
                                if (apartment.riddle2Answered = true){
                                    inputKey = apartment.riddle3Input();
                                    outputString = apartment.riddle3Output(inputKey);
                                    System.out.println(outputString);
                                }
                                    if (apartment.riddle3Answered = true){
                                        inputKey = apartment.finalHousecatInput();
                                        outputString = apartment.finalHousecatOutput(inputKey);
                                        System.out.println(outputString);
                                    }
                }
            }
            
            //harbor lane  
            if (x == 2 && y==0){
                inputKey = harborlane.twoZeroInput();
                outputString = harborlane.twoZeroOutput(inputKey);
                System.out.println(outputString);
            }
            if ( x == 2 && y==1){
                inputKey = harborlane.twoOneInput();
                outputString = harborlane.twoOneOutput(inputKey);
                System.out.println(outputString);
            }
            if ( x == 2 && y==2){
                inputKey = harborlane.twoTwoInput();
                outputString = harborlane.twoTwoOutput(inputKey);
                System.out.println(outputString);
            }
            if ( x == 2 && y==-1){
                inputKey = harborlane.twoNegOneInput();
                outputString = harborlane.twoNegOneOutput(inputKey);
                System.out.println(outputString);
            }
            if ( x == 2 && y==-2){
                inputKey = harborlane.twoNegTwoInput();
                outputString = harborlane.twoNegTwoOutput(inputKey);
                System.out.println(outputString);
            }

            //crossroads
            if (x == -2 && y == 0){
                inputKey = calmStreet.negTwoZeroInput();
                outputString = calmStreet.negTwoZeroOutput(inputKey);
                System.out.println(outputString);
            }

            //calm street 1
            if (x == -2 && y == 1){
                inputKey = calmStreet.negTwoOneInput();
                outputString = calmStreet.negTwoOneOutput(inputKey);
                System.out.println(outputString);
            }

            //calm street 2
            if (x == -2 && y == 2){
                inputKey = calmStreet.negTwoTwoInput();
                outputString = calmStreet.negTwoTwoOutput(inputKey);
                System.out.println(outputString);
            }

            //calm street 3
            if (x == -2 && y == 3){
                inputKey = calmStreet.negTwoThreeInput();
                outputString = calmStreet.negTwoThreeOutput(inputKey);
                System.out.println(outputString);
            }

            //to park on calm street A
            if (x==-2 && y==-1){
                inputKey = calmStreet.negTwoNegOneInput();
                outputString = calmStreet.negTwoNegOneOutput(inputKey);
                System.out.println(outputString);
            }

            //to park on calm street B
            if (x== -2 && y == -2){
                inputKey = calmStreet.negTwoNegTwoInput();
                outputString = calmStreet.negTwoNegTwoOutput(inputKey);
                System.out.println(outputString);

            }
            //at the park before dog has bone
            if (x== -2 && y== -3){
                //before dog has bone
                if (player.dogHasBone()==false){
                    inputKey = park.negTwoNegThreeInput();
                    outputString = park.negTwoNegThreeOutput(inputKey); 
                    System.out.println(outputString);
                }
                //at park after dog has bone
                if (player.dogHasBone()==true){
                    inputKey = park.nextMoveInput();
                    outputString = park.nextMoveOutput(inputKey);
                    System.out.println(outputString);
                }  
            }
            if (x == -2 && y == -4){
                inputKey = park.negTwoNegFourInput();
                outputString = park.negTwoNegFourOutput(inputKey);
                System.out.println(outputString);
            }
            if (x == -1 && y == -3){
                inputKey = park.negOneNegThreeInput();
                outputString = park.negOneNegThreeOutput(inputKey);
                System.out.println(outputString);
            }

            // fishmarket A
            if (x == -1 && y == 3){
                if (player.hasBone() == false){
                inputKey = fishmarketA.negOneThreeInput();
                outputString = fishmarketA.negOneThreeOutput(inputKey);
                System.out.println(outputString);
                }
            }
            if (x == 0 && y == 3){
                if (player.hasBone() == false){
                inputKey = fishmarketA.zeroThreeInput();
                outputString = fishmarketA.zeroThreeOutput(inputKey);
                System.out.println(outputString);
                }
            }
            if (x == -1 && y == 4){
                if (player.hasBone() == false){
                inputKey = fishmarketA.negOneFourInput();
                outputString = fishmarketA.negOneFourOutput(inputKey);
                System.out.println(outputString);
                }
            }
            if (x == 0 && y == 4){
                if (player.hasBone() == false){
                inputKey = fishmarketA.zeroFourInput();
                outputString = fishmarketA.zeroFourOutput(inputKey);
                System.out.println(outputString);
                }
            }  

            // fishmarket B
            if (x == -1 && y == 3){
                if (player.hasBone() == true){
                inputKey = fishmarketB.negOneThreeInput();
                outputString = fishmarketB.negOneThreeOutput(inputKey);
                System.out.println(outputString);
                }
            }
            if (x == 0 && y == 3){
                if (player.hasBone() == true){
                inputKey = fishmarketB.zeroThreeInput();
                outputString = fishmarketB.zeroThreeOutput(inputKey);
                System.out.println(outputString);
                }
            }
            if (x == -1 && y == 4){
                if (player.hasBone() == true){
                inputKey = fishmarketB.negOneFourInput();
                outputString = fishmarketB.negOneFourOutput(inputKey);
                System.out.println(outputString);
                }
            }
            if (x == 0 && y == 4){
                if (player.hasBone() == true){
                inputKey = fishmarketB.zeroFourInput();
                outputString = fishmarketB.zeroFourOutput(inputKey);
                System.out.println(outputString);
                }
            }          
            
        

        }
    }
}