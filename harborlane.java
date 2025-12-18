public class harborlane {

    public int change = 0;
    private skeem player;
    private location loc;

    public harborlane(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    //just walking through the gate
    public int twoZeroInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "EAST";
            String case2 = "GO EAST"; 

            String case3 = "NORTH";
            String case4 = "GO NORTH";

            String case5 = "SOUTH";
            String case6 = "GO SOUTH";

            String case7 = "WEST";
            String case8 = "GO WEST";

            if (userInput.equals(case1)|| userInput.equals(case2)){
                change = 1;
                return change; //east
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change;//north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        }
    }

    public String twoZeroOutput(int inputKey){
        //go west
        if (inputKey == 4){
            loc.setLocation(1,0);
            return "\n you walk through the gate and are once again faced with an alleyway littered with cardbord boxes. \n you can only go east or west... \n";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(2,1);
            return "\n you hear the cars zoom past you on the busy street to the east. \n in front of you see that the side walk leads to the surround ocean\n";
            // here you can only go north and south. there is no cross walk here and the buldings to the west have no place for you to go
        }
        //go south
        if (inputKey == 3){
            loc.setLocation(2,-1);
            return "\n you hear a loud honk from a car that just swerved to avoid a collison, its really crazy over there \n in the distance you see a sign, you might able to read it better if continue south\n";
            // here you can only go north and south. there is no cross walk here and the buldings to the east have no place for you to go
        }
        //go east
        if (inputKey == 1){
            loc.setLocation(3, 0);

            if (player.eatFood() == false){
                return "\n you have reached the crosswalk of the busy street. the thought of crossing the street makes your stomach grumble. \n i don't know if you have the energy for that, skeem\n";
            }
            if (player.eatFood() == true){
                return "\n you have reached the crosswalk of the busy street. now that you are no longer hungry you can see that the building in the distance is your home! \n but oh no! it looks the light for the cross walk is broken </3 \n are you courageous enough to try and get home anyways skeem?\n";
            }
            else {
                return "\n this shouldn't happen check food boolean\n";
            }
        }
        else {
            return "\n i don't understand\n";
        }  
    }

    public int twoOneInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "EAST";
            String case2 = "GO EAST"; 

            String case3 = "NORTH";
            String case4 = "GO NORTH";

            String case5 = "SOUTH";
            String case6 = "GO SOUTH";

            String case7 = "WEST";
            String case8 = "GO WEST";

            if (userInput.equals(case1)|| userInput.equals(case2)){
                change = 1;
                return change; //east
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change;//north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        }
    }

    public String twoOneOutput(int inputKey){
        //go west
        if (inputKey == 4){
            return "\n you cannot go west, there is nothing here but the building fronts. \n continue north or south.\n";
        }
        //go south
        if (inputKey == 3){
            loc.setLocation(2,0);
            return "\n you are back infront of the gate. in the distance, to your east, you see a building vaguely familiar but too far for your cat eyes to make out.\n looks like you could finally go, east, south, west, or north. the world is your oyster!\n";
            // here you can only go north and south. there is no cross walk here and the buldings to the west have no place for you to go
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(2,2);
            return "\n you hear a loud honk from a car that just swerved to avoid a collison, its really crazy over there.\n";
            // here you can only go north and south. there is no cross walk here and the buldings to the east have no place for you to go
        }
        //go east
        if (inputKey == 1){
            return "\n you cannot go east, there is no cross walk here\n";
        }
        else {
            return "\n i don't understand\n";
        }
    }

    public int twoTwoInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "EAST";
            String case2 = "GO EAST"; 

            String case3 = "NORTH";
            String case4 = "GO NORTH";

            String case5 = "SOUTH";
            String case6 = "GO SOUTH";

            String case7 = "WEST";
            String case8 = "GO WEST";

            if (userInput.equals(case1)|| userInput.equals(case2)){
                change = 1;
                return change; //east
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change;//north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        } 
    }

    public String twoTwoOutput(int inputKey){
        // go east
        if (inputKey == 1){
            return "\n you cannot go east, there is no cross walk here.\n";
        }
        // go north
        if (inputKey == 2){
            return "\n there is nothing beyond here but the beautiful ocean, you can't help but stare at it.\n";
        }
        // go south
        if (inputKey == 3){
            loc.setLocation(2,1);
            return "\n  you hear the cars zoom past you on the busy street to the east. if you continue south you are back to the entrance infront of the gate \n";
        }
        // go west
        if (inputKey == 4){
            return "\n you cannot go west, there is nothing here but the building fronts. continue south.\n";
        }
        else {
            return "\n i don't understand\n";
        }
    }

    public int twoNegOneInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "EAST";
            String case2 = "GO EAST"; 

            String case3 = "NORTH";
            String case4 = "GO NORTH";

            String case5 = "SOUTH";
            String case6 = "GO SOUTH";

            String case7 = "WEST";
            String case8 = "GO WEST";

            if (userInput.equals(case1)|| userInput.equals(case2)){
                change = 1;
                return change; //east
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change;//north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        } 
    }

    public String twoNegOneOutput(int inputKey){
       // go east
        if (inputKey == 1){
            return "\n you cannot go east, there is no cross walk here.\n";
        }
        // go north
        if (inputKey == 2){
            loc.setLocation(2,0);
            return "\n you are back infront of the gate. in the distance, to your east, you see a building vaguely familiar but too far for your cat eyes to make out.\n looks like you could finally go, east, south, west, or north. the world is your oyster!\n";
        }
        // go south
        if (inputKey == 3){
            loc.setLocation(2,-2);
            return "\n you reach a street sign that tells you that you this is Harbor Lane. this feels significant in a way.\n";
        }
        // go west
        if (inputKey == 4){
            return "\n you cannot go west, there is nothing here but the building fronts. continue north or south.\n";
        }
        else {
            return "\n i don't understand\n";
        }
    }

    public int twoNegTwoInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "EAST";
            String case2 = "GO EAST"; 

            String case3 = "NORTH";
            String case4 = "GO NORTH";

            String case5 = "SOUTH";
            String case6 = "GO SOUTH";

            String case7 = "WEST";
            String case8 = "GO WEST";

            if (userInput.equals(case1)|| userInput.equals(case2)){
                change = 1;
                return change; //east
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change;//north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        }
    }

    public String twoNegTwoOutput(int inputKey){
       // go east
        if (inputKey == 1){
            return "\n you cannot go east, there is no cross walk here.\n";
        }
        // go north
        if (inputKey == 2){
            loc.setLocation(2,-1);
            return "\n you hear another loud honk from a car that just swerved to avoid a collison, its really crazy over there\n";
        }
        // go south
        if (inputKey == 3){
            return "\n there is nothing beyond but the space where your cat paws reach the ocean. it is nothing less than beautiful.\n";
        }
        // go west
        if (inputKey == 4){
            return "\n you cannot go west, there is nothing here but the building fronts. continue north.\n";
        }
        else {
            return "\n i don't understand\n";
        }
    }
}   
