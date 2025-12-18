public class fishmarketA {

    private skeem player;
    private location loc;
    public int change = 0;

    public fishmarketA(skeem player, location loc){
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
                return "\n as you enter the small, rustic shop, you spot the fishmonger. \n he is distracted at the counter, chopping fish with a big, shiny knife and singing along happily to a song. \n 'seabird, seabird, fly home...' the fishmonger sings. \n 'like a lonely seabird, you've been away from land far too long..' \n";
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
    // previous output: as you enter the small, rustic shop, you spot the fishmonger.
    // he is distracted at the counter, chopping fish with a big, shiny knife and singing along happily to a song.
    //  'seabird, seabird, fly home...' the fishmonger sings.
    // 'like a lonely seabird, you've been away from land far too long..'

    public int zeroThreeInput(){
            while (true){
                change = 0;
                userIO userIO = new userIO();
                String userInput = userIO.readInput();

                String case1 = "EAST"; // attempt to go further in
                String case2 = "GO EAST"; 
                String case3 = "GO TO FISHMONGER"; 
                String case4 = "GO TO COUNTER";
                String case5 = "TALK TO FISHMONGER"; // attempt to talk to him or do an action
                String case6 = "TAKE KNIFE"; 
                String case7 = "EAT FISH";

                String case8 = "NORTH"; // can't go this way
                String case9 = "GO NORTH";

                String case10 = "SOUTH"; // can't go this way
                String case11 = "GO SOUTH";

                String case12 = "WEST"; // go back outside
                String case13 = "GO WEST";


                if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)|| userInput.equals(case4) || userInput.equals(case5) || userInput.equals(case6)|| userInput.equals(case7)){
                    change = 1;
                    return change; //east or action
                }
                if (userInput.equals(case8)|| userInput.equals(case9)){
                    change = 2;
                    return change; //north
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
                    System.out.println("\n i don't understand \n");
                }
            
            }

        }

    public String zeroThreeOutput(int inputKey){
            // go east, get chased away
            if (inputKey == 1){
                loc.setLocation(-1, 3);
                return "\n as you take another step into the shop, the fishmonger looks up and notices you. \n he abruptly stops singing and his smile turns into a frown. \n 'get out, you stray cat! you can't have any fish!' he shouts, waving his knife at you. \n frightened, you run back out to the entrance. there's still that path to the north...\n";
            }
            //go north
            if (inputKey == 2){
                return "\n you can't go anywhere. \n the shop is small and there isn't much to explore, but the aroma of fish makes your mouth water. \n";
            }
            //go south
            if (inputKey == 3){
                return "\n you can't go anywhere. \n the shop is small and there isn't much to explore, but the aroma of fish makes your mouth water. \n";
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
                return "\n you sneak in through the back door and find yourself in a small storage room filled with crates of supplies. \n there is a big fish on a small table right in front of you. \n you can hear the fishmonger milling around in the other room, but he has no idea you're there. \n";
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

    public int zeroFourInput(){
            while (true){
                change = 0;
                userIO userIO = new userIO();
                String userInput = userIO.readInput();

                String case1 = "EAT FISH"; 

                String case2 = "LEAVE";
                String case3 = "WEST";
                String case4 = "GO WEST";
                String case5 = "LEAVE FISH MARKET";


                if (userInput.equals(case1)){
                    change = 1;
                    return change; 
                }
                if (userInput.equals(case2) || userInput.equals(case3) || userInput.equals(case4) || userInput.equals(case5)){
                    change = 2;
                    return change; 
                }
                else{
                    System.out.println("\n you can't do that here. there is a fish right in front of you. \n");
                }
            
            }

        }

    public String zeroFourOutput(int inputKey){
            //eat fish
            if (inputKey == 1){
                loc.setLocation(-1, 4);
                player.setBone(true);
                return "\n you eat the fresh, juicy fish with delight, satisfying a bit of the hunger in your stomach. \n you pick up the bone that is left behind. this might come in handy later... \n you walk back outside, just in case the fishmonger catches sight of you. \n";
            }
            if (inputKey == 2){
                loc.setLocation(-1, 4);
                return "\n you return to the small, overgrown path. the front entrance to the fishmarket is to the south. \n the back door to the east is slightly ajar, and you smell the scent of freshly caught fish. \n";
            }
            else{
                return "\n why would you type that, i dont understand\n";
            }
        }


}
