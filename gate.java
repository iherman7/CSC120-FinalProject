/**
 * This class operates the game in the "gate" location.
 */
public class gate {
    
    /**
     * attributes
     */
    public int change = 0;
    private skeem player;
    private location loc;

    /**
     * gate construtor
     * @param player same passed through each location
     * @param loc same passed through each location
     */
    public gate(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }
        

    /**
     * runs through possibilities at location (1,0) in front of the gate
     * @return the change based on the user's input
     */
    public int oneZeroInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "EAST";
            String case2 = "GO EAST"; // check logic later, have to check first for case then key
            String case3 = "NORTH";
            String case4 = "GO NORTH";
            String case5 = "SOUTH";
            String case6 = "GO SOUTH";
            String case7 = "WEST";
            String case8 = "GO WEST"; 

            String case9 = "USE KEY";
            String case10 = "OPEN GATE";
            // add in a case where we specifically have to use language to unlock gate, then from there step east

            if (userInput.equals(case1)|| userInput.equals(case2)){ // will look differnt call from game loop
                
                if (player.hasKey() == false){ //locked no key
                        change = 1;
                        return change;
                    }
                if (player.hasKey() == true && player.gateOpen()==false){ //locked with key
                    change = 2;
                    return change;
                }
                if (player.gateOpen() == true){
                    change = 6;
                    return change;
                }
            }

            if (userInput.equals(case3)|| userInput.equals(case4)|| userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change;
            }
            if (userInput.equals(case7) || userInput.equals(case8)){
                change = 4;
                return change;
            }
            if (userInput.equals(case9) || userInput.equals(case10)){
                if (player.hasKey()==true){
                    change = 5;
                    return change;
                }
                else {
                    System.out.println("\n you don't have a key\n");
                    continue;
                }
            }
            else {
                System.out.println("\n i don't understand\n");
            }
        
        }

    }

    /**
     * takes the input of method above and read it to give an output. changes location if needed 
     * opens gates if key is used
     * @param inputKey the input that was just passed from (1,0)
     */
    public String oneZeroOutput(int inputKey){
        // went east with no key
        if (inputKey == 1){
            return "\n the gate is locked. you might need a key to open it...\n";
            } 
        // unlock gate -- the next scene after this would take place at harbor lane
        if (inputKey == 2){
            return "\n the gate is locked but it looks like you have a key right there in you mouth. maybe give it a try or go west.\n";
            }
        // east and gate open
        if (inputKey == 6){
            return "\n you walk onto a sidewalk infront of a busy street \n in the distance you see a building vaguely familiar but too far for your cat eyes to make out. \n looks like you could finally go, east, south, west, or north. the world is your oyster! \n";
        }
        // tried to go north/south
        if (inputKey == 3){
            return "\n you can't go that way, silly\n";
        }
        // go back west
        if (inputKey == 4){
            loc.setLocation(0, 0);
            return "\n you're where you woke up in the back alleyway between some rows of apartments. \n looks like you can only go east or west...\n";
        }
        if (inputKey == 5){
            loc.setLocation(2, 0);
            player.setGate(true);
            return "\n you use your cat mouth to put the key into the gate and it swings open! \n you walk onto a sidewalk infront of a busy street \n in the distance you see a building vaguely familiar but too far for your cat eyes to make out. \n looks like you could finally go, east, south, west, or north. the world is your oyster!\n";

        }
        else {
            return "\n i don't understand\n";
        }
    }
}
