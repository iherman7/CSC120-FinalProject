public class fishmarket {

    private skeem player;
    private location loc;
    public int change = 0;

    public fishmarket(skeem player, location loc){
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
                return "\n enter fish market, hear song playing, see knife, cannot advance? or does the fishmonger chase you out?\n";
            }
            //go north, follow path
            if (inputKey == 2){
                return "\n you walk down a small, overgrown path that leads right to the back door of the fish market. I forgot the plot tbh.\n";
            }
            //go south
            if (inputKey == 3){
                loc.setLocation(-2, 2);
                return "\n you can't walk that way.\n";
            }
            //go west
            if (inputKey == 4){
                loc.setLocation(-2 ,3);
                return "\n you return to the dead end at a dock populated with fishing boats. \n there is a small path to the east, with more fish leading the way.\n";
            }
            else{
                return "\n why would you type that, i dont understand\n";
            }
        }


}
