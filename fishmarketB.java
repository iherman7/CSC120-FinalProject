public class fishmarketB {
    
    private skeem player;
    private location loc;
    public int change = 0;

    public fishmarketB(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    // (-1, 3) right in front of fish market
    // previous output: the path leads you to a small, weathered fish market. \n 
    //                  you hear faint music from inside... \n the front door is wide open, and your stomach grumbles. 
    //                  there is also a small path to the north that seems to lead to the back of the building.\n

    public int negOneThreeInput(){
            while (true){
                change = 0;
                userIO userIO = new userIO();
                String userInput = userIO.readInput();

                String case1 = "EAST"; // go inside
                String case2 = "GO EAST"; 
                String case3 = "ENTER FISH MARKET"; 
                String case4 = "GO TO DOOR";
                String case5 = "GO INSIDE";

                String case6 = "TAKE PATH"; // go to back
                String case7 = "GO TO PATH";
                String case8 = "NORTH";
                String case9 = "GO NORTH";

                String case10 = "SOUTH"; // can't go this way
                String case11 = "GO SOUTH";

                String case12 = "WEST"; // go back to calm street dead end
                String case13 = "GO WEST";


                if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)|| userInput.equals(case4)|| userInput.equals(case5)){
                    change = 1;
                    return change; //east
                }
                if (userInput.equals(case6)|| userInput.equals(case7)|| userInput.equals(case8)|| userInput.equals(case9)){
                    change = 2;
                    return change;//north
                }
                if (userInput.equals(case10)|| userInput.equals(case11)){
                    change = 3;
                    return change; //south
                }
                if (userInput.equals(case12)|| userInput.equals(case13)){
                    change = 4;
                    return change; //west
                }
                else{
                    System.out.println("\n why would you type that, i don't understand\n");
                }
            
            }

        }

    public String negOneThreeOutput(int inputKey){
            //go east, enter fish market
            if (inputKey == 1){
                loc.setLocation(0, 3);
                return "\n as you enter the small, rustic shop, you notice that it is now empty. \n The fishmonger has gone off somewhere, and he left his knife on the countertop. \n this could be the perfect opportunity to sharpen your claws... \n";
            }
            //go north, follow path
            if (inputKey == 2){
                loc.setLocation(-1, 4);
                return "\n you walk down a small, overgrown path that leads you to the back door of the fish market. \n the door is slightly ajar and to your east, and you smell the scent of freshly caught fish. \n";
            }
            //go south
            if (inputKey == 3){
                return "\n you can't walk that way.\n";
            }
            //go west
            if (inputKey == 4){
                loc.setLocation(-2 ,3);
                return "\n you return to the dead end of the calm street at a dock populated with fishing boats. \n there is a small path to the east, with more fish leading the way.\n";
            }
            else{
                return "\n why would you type that, i dont understand\n";
            }
        }

    // (0, 3) inside front area of fish market
    // previous output: as you enter the small, rustic shop, you notice that it is now empty.
    // The fishmonger has gone off somewhere, and he left his knife on the countertop.
    // this could be the perfect opportunity to sharpen your claws...

    public int zeroThreeInput(){
            while (true){
                change = 0;
                userIO userIO = new userIO();
                String userInput = userIO.readInput();

                String case1 = "EAST"; // sharpen claws
                String case2 = "GO EAST"; 
                String case3 = "GO TO COUNTER";
                String case4 = "SHARPEN CLAWS"; 
                String case5 = "USE KNIFE"; 
                String case6 = "GO TO KNIFE";

                String case7 = "NORTH"; // can't go this way
                String case8 = "GO NORTH";

                String case9 = "SOUTH"; // can't go this way
                String case10 = "GO SOUTH";

                String case11 = "WEST"; // go back outside
                String case12 = "GO WEST";


                if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)|| userInput.equals(case4) || userInput.equals(case5) || userInput.equals(case6)){
                    change = 1;
                    return change; 
                }
                if (userInput.equals(case7)|| userInput.equals(case8)){
                    change = 2;
                    return change; 
                }
                if (userInput.equals(case9)|| userInput.equals(case10)){
                    change = 3;
                    return change; 
                }
                if (userInput.equals(case11)|| userInput.equals(case12)){
                    change = 4;
                    return change; 
                }
                else{
                    System.out.println("\n i don't understand \n");
                }
            
            }

        }

    public String zeroThreeOutput(int inputKey){
            // sharpen claws
            if (inputKey == 1){
                loc.setLocation(-1, 3);
                player.setClaw(true);
                return "\n you jump up onto the counter and carefully use the knife to sharpen your dull claws. \n you leave quickly, worried the fishmonger might return soon. \n you are now at the entrance to the fish market with freshly sharpened claws. \n";
            }
            //go north
            if (inputKey == 2){
                return "\n you can't go anywhere except the counter. \n the shop is small and there isn't much to explore, but the aroma of fish makes your mouth water. \n";
            }
            //go south
            if (inputKey == 3){
                return "\n you can't go anywhere except the counter. \n the shop is small and there isn't much to explore, but the aroma of fish makes your mouth water. \n";
            }
            // go west
            if (inputKey == 4){
                loc.setLocation(-1 ,3);
                return "\n you are at the entrance to a small, weathered fish market. \n you hear faint music from inside... \n the front door is wide open, and your stomach grumbles. \n there is also a small path to the north that seems to lead to the back of the building..\n";
            }
            else{
                return "\n i dont understand\n";
            }
        
        }

    // (-1, 4) back path to back entrance of fishmarket
    // previous output: you walk down a small, overgrown path that leads you to the back door of the fish market.
    //  the door is slightly ajar, and you smell the scent of freshly caught fish. 

    public int negOneFourInput(){
            while (true){
                change = 0;
                userIO userIO = new userIO();
                String userInput = userIO.readInput();

                String case1 = "EAST"; // go inside
                String case2 = "GO EAST"; 
                String case3 = "ENTER FISH MARKET"; 
                String case4 = "GO TO DOOR";
                String case5 = "GO INSIDE";

                String case6 = "TAKE PATH"; // go back to calm street dead end
                String case7 = "GO TO PATH";
                String case8 = "SOUTH";
                String case9 = "GO SOUTH";

                String case10 = "NORTH"; // can't go this way
                String case11 = "GO NORTH";

                String case12 = "WEST"; // can't go this way
                String case13 = "GO WEST";


                if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)|| userInput.equals(case4)|| userInput.equals(case5)){
                    change = 1;
                    return change; //east
                }
                if (userInput.equals(case6)|| userInput.equals(case7)|| userInput.equals(case8)|| userInput.equals(case9)){
                    change = 2;
                    return change;//south
                }
                if (userInput.equals(case10)|| userInput.equals(case11)){
                    change = 3;
                    return change; //north
                }
                if (userInput.equals(case12)|| userInput.equals(case13)){
                    change = 4;
                    return change; //west
                }
                else{
                    System.out.println("\n i don't understand\n");
                }
            
            }

        }

    public String negOneFourOutput(int inputKey){
            //go east, enter back door of fish market
            if (inputKey == 1){
                loc.setLocation(0, 4);
                return "\n you sneak in through the back door and find yourself in a small storage room filled with crates of supplies. \n the fish are gone from the table. \n";
            }
            //go south, back to path
            if (inputKey == 2){
                loc.setLocation(-1, 3);
                return "\n you walk back down the path. \n you are at the entrance to a small, weathered fish market. you hear faint music from inside... \n the front door is wide open, and your stomach grumbles. \n";
            }
            //go north
            if (inputKey == 3){
                return "\n you can't walk this way. \n";
            }
            //go west
            if (inputKey == 4){
                return "\n you can't walk this way. \n";
            }
            else{
                return "\n why would you type that, i dont understand\n";
            }
        }

    // (0, 4) inside back part of fish market
    // previous output: you sneak in through the back door and find yourself in a small storage room filled with crates of supplies.
    // there is a big fish on a small table right in front of you.
    // you can hear the fishmonger milling around in the other room, but he has no idea you're there.

    // public int zeroFourInput(){
    //         while (true){
    //             change = 0;
    //             userIO userIO = new userIO();
    //             String userInput = userIO.readInput();

    //             String case1 = "ENTER FISH MARKET"; // go inside
    //             String case2 = "GO INSIDE";
    //             String case3 = "ENTER DOOR";

    //             String case4 = "TAKE PATH"; // go back to path
    //             String case5 = "GO TO PATH";
    //             String case6 = "SOUTH";
    //             String case7 = "GO SOUTH";

    //             if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)){
    //                 change = 1;
    //                 return change; // inside
    //             }
    //             if (userInput.equals(case4)|| userInput.equals(case5)|| userInput.equals(case6)|| userInput.equals(case7)){
    //                 change = 2;
    //                 return change;// path
    //             }
    //             else{
    //                 System.out.println("\n the back door to the fishmarket is slightly ajar. \n");
    //             }
            
    //         }

    //     }

    // public String zeroFourOutput(int inputKey){
    //         //enter back door
    //         if (inputKey == 1){
    //             return "\n you sneak in through the back door and find yourself in a small storage room filled with crates of supplies. \n there is a big fish on a small table right in front of you. \n you can hear the fishmonger milling around in the other room, but he has no idea you're there. \n";
    //         }
    //         // go back to path
    //         if (inputKey == 2){
    //             loc.setLocation(-1, 3);
    //             return "\n you walk back down the path. \n you are at the entrance to a small, weathered fish market. you hear faint music from inside... \n the front door is wide open, and your stomach grumbles. \n";
    //         }
    //         else{
    //             return "\n why would you type that, i dont understand\n";
    //         }
    //     }

    // (0, 4) inside back part of fish market
    // previous output: you sneak in through the back door and find yourself in a small storage room filled with crates of supplies.
    //              there is a big fish on a small table right in front of you.
    //              you can hear the fishmonger milling around in the other room, but he has no idea you're there.

    public int zeroFourInput(){
            while (true){
                change = 0;
                userIO userIO = new userIO();
                String userInput = userIO.readInput();

                String case1 = "LEAVE";
                String case2 = "WEST";
                String case3 = "GO WEST";
                String case4 = "LEAVE FISH MARKET";

                if (userInput.equals(case1) || userInput.equals(case2) || userInput.equals(case3) || userInput.equals(case4)){
                    change = 1;
                    return change; 
                }
                else{
                    System.out.println("\n you can't do that here. \n");
                }
            
            }

        }

    public String zeroFourOutput(int inputKey){
            if (inputKey == 1){
                loc.setLocation(-1, 4);
                return "\n you return to the small, overgrown path. the front entrance to the fishmarket is to the south. \n the back door to the east is slightly ajar, and you smell the scent of freshly caught fish. \n";
            }
            else{
                return "\n why would you type that, i dont understand\n";
            }
        }

}
