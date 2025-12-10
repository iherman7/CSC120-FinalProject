public class calmStreet {

    private skeem player;
    private location loc;
    public int change = 0;

    public calmStreet(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    //im making pathway on calm street to the park
    public int negTwoZeroInput(){
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

    public String negTwoZeroOutput(int inputKey){
        //go east
        if (inputKey == 1){
            loc.setLocation(-1, 0);
            return " you're back in the alleyway \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(-2, 1);
            return " something something...there's tiny fish";
        }
        //go south
        if (inputKey == 3){
            loc.setLocation(-2, -1);
            return " you continue south, the trees lining the street seem to lead to an even greener place up ahead";
        }
        //go west
        if (inputKey == 4){
            return " there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove";
        }
        else{
            return " why would you type that, i dont understand";
        }
    }

    public int negTwoNegOneInput(){
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
                return change; //north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south!!
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

    public String negTwoNegOneOutput(int inputKey){
        //go east
        if (inputKey == 1){
            return " the street doesn't have any turns here, maybe try north or south";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(-2, 0);
            return " you have come to a crossroads...the only way forward is to walk is north or south or east back into the alley way";
        }
        //go south
        if (inputKey == 3){
            loc.setLocation(-2, -2);
            return " the calm street has revealed leaning tree park right infront. what fun! ";
        }
        //go west
        if (inputKey == 4){
            return " there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove";
        }
        else{
            return " why would you type that, i dont understand";
        }
    }

    public int negTwoNegTwoInput(){
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

        String case9 = "ENTER PARK";
        String case10 = "GO TO PARK";
        String case11 = "GO FORWARD";
        String case12 = "FORWARD";

        if (userInput.equals(case1)|| userInput.equals(case2)){
            change = 1;
            return change; //east
        }
            if (userInput.equals(case3)|| userInput.equals(case4)){
            change = 2;
            return change;//north
        }
            if (userInput.equals(case5)|| userInput.equals(case6)||userInput.equals(case9)|| userInput.equals(case10)||userInput.equals(case11)|| userInput.equals(case12)){
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

    public String negTwoNegTwoOutput(int inputKey){
    //go east
    if (inputKey == 1){
        return " the street doesn't have any turns here, maybe try north or south";
    }
    //go north
    if (inputKey == 2){
        loc.setLocation(-2, -1);
        return " you walk back up the calm, street...it really is calm here";
    }
    //go south
    if (inputKey == 3){
        loc.setLocation(-2, -3);
        return " you have entered the park! \n the greenery sourounds you to the south and to the east, but you are intimidated by a scary and somber looking dog that is watching your every move";
    }
    //go west
    if (inputKey == 4){
        return " there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove";
    }
    else{
        return " why would you type that, i dont understand";
    }
    }

}  



