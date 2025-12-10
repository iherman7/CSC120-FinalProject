public class harborlane {

    public int change = 0;
    private skeem player;
    private location loc;

    public harborlane(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    //just walking through the gate
    public int zeroTwoInput(){
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
                System.out.println(" why would you type that, i don't understand");
            }
        }
    }

    public String zeroTwoOutput(int inputKey){
        //go west
        if (inputKey == 4){
            loc.setLocation(0,1);
            return " you walk through the gate and are once again faced with an alleyway litterd with cardbord boxes. \n you can only go east or west";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(2,1);
            return " you hear the cars zoom past you on the busy street to the east. \n in front of you see that the side walk leads to the surround ocean";
            // here you can only go north and south. there is no cross walk here and the buldings to the west have no place for you to go
        }
        //go south
        if (inputKey == 3){
            loc.setLocation(2,-1);
            return " you hear a loud honk from a car that just swerved to avoid a collison, its really crazy over there \n you might get a better vantage point of things if you walk forward";
            // here you can only go north and south. there is no cross walk here and the buldings to the east have no place for you to go
        }
        //go east
        if (inputKey == 1){
            loc.setLocation(0, 3);

            if (player.eatFood() == false){
                return " you have reached the crosswalk of the busy street. the thought of crossing the street makes your stomach grumble. \n i don't know if you have the energy for that skeem";
            }
            if (player.eatFood() == true){
                return " you have reached the crosswalk of the busy street. now that you are no longer hungry you can see that the building in the distance is your home! \n but oh no! it looks the walk light for the cross walk is broken </3 \n how ever will you get home skeem!";
            }
            else {
                return " this shouldn't happen check food boolean";
            }
        }
        else {
            return " i don't understand";
        }  
    }
}   
