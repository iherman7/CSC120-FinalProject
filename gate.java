public class gate extends location {
    
    private skeem player; 
    public int change = 0;

    public gate(skeem player){
        this.player = player;
    }
        

    public int oneZeroInput(hasKey){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "WEST";
            String case2 = "GO WEST"; // check logic later, have to check first for case then key
            String case3 = "NORTH";
            String case4 = "GO NORTH";
            String case5 = "SOUTH";
            String case6 = "GO SOUTH";

            if (userInput.equals(case1)|| userInput.equals(case2){ // will look differnt call from game loop
                if (hasKey == false){ // need this condition; figure how to write it
                    if (userInput.equals(case1)|| userInput.equals(case2)){
                        change = 1;
                        return change;
                    }
            }
            if (hasKey == true){
                if (userInput.equals(case1)|| userInput.equals(case2)){
                    change = 2;
                    return change;
                }
            }
            else {
            System.out.println("i don't understand");
            }
        }
        }

        }



    }

    // set location
    //say you cannot do anything if boolean hasKey is false
    //if boolean hasKey is true and they have said something along the lines of use key, open gate
    //then the rest of the game can continue

public String oneZeroOutput(int inputKey){
     if (inputKey == 1){
            return " the gate is locked. i think you might need a key to open it ";
        } 
    if (inputKey == 2){
            return " you use your cat mouth to put the key into the gate and it swings open! \n the gate was so tall the light coming in blinds you \n you wonder what is beyond the gate.";
        } 
    else {
        return " i don't understand";
    }
    }
}
}
