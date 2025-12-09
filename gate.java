public class gate {
    
    public int change = 0;
    private skeem player;
    private location loc;

    public gate(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }
        

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

            if (userInput.equals(case1)|| userInput.equals(case2)){ // will look differnt call from game loop
                
                if (player.hasKey() == false){ // need this condition; figure how to write it
                        change = 1;
                        return change;
                    }
                if (player.hasKey() == true){
                    change = 2;
                    return change;
                }
            }

            if (userInput.equals(case3)|| userInput.equals(case4)|| userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
            }
            if (userInput.equals(case7) || userInput.equals(case8)){
                change = 4;
            }
            else {
            System.out.println(" i don't understand");
            }
        
        }

    }





    // set location
    //say you cannot do anything if boolean hasKey is false
    //if boolean hasKey is true and they have said something along the lines of use key, open gate
    //then the rest of the game can continue

public String oneZeroOutput(int inputKey){
    // went east with no key
    if (inputKey == 1){
        return " the gate is locked. i think you might need a key to open it ";
        } 
    // unlock gate
    if (inputKey == 2){
        loc.setLocation(2, 0);
        return " you use your cat mouth to put the key into the gate and it swings open! \n the gate was so tall the light coming in blinds you \n you wonder what is beyond the gate.";
        } 
    // tried to go north/south
    if (inputKey == 3){
        return " you can't go that way, silly";
    }
    // go back west
    if (inputKey == 4){
        loc.setLocation(0, 0);
        return " you're in the back alleyway between some rows of apartments. \n looks like you can only go east or west...";
    }
    else {
        return " i don't understand";
    }
    }
}

