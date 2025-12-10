public class alleyway {

    public int change = 0;
    private skeem player;
    private location loc;
    private int x;
    private int y;
        
    public alleyway(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    public int openingInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "WAKE UP";
            
            if (userInput.equals(case1)){
                change = 1;
                return change;
            } else {
                System.out.println(" i don't understand");
            }
        }
    }


    public String openingOutput(int inputKey){
        if (inputKey == 1){
            return " oh good! you've finally woken up, sleepy head. \n it seems you shed the remains of your human body and have woken up as a cat? \n skeem, you must have had something weird to eat last night... \n you're in the back alleyway between some rows of apartments...oh no, you're far from home! \n looks like you can only go east or west...";
        } else {
            return " i don't understand";
        }
    }

    public int zeroZeroInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "GO EAST";
            String case2 = "EAST";
            String case3 = "GO WEST";
            String case4 = "WEST";
            String case5 = "GO NORTH";
            String case6 = "NORTH";
            String case7 = "SOUTH";
            String case8 = "GO SOUTH";
            
            if (userInput.equals(case1)|| userInput.equals(case2)){
                change = 1;
                return change;
            }
            if (userInput.equals(case3) || userInput.equals(case4)){
                change = 2;
                return change;
            } 
            if (userInput.equals(case5)|| userInput.equals(case6)|| userInput.equals(case7)|| userInput.equals(case8)){
                System.out.println(" you can't walk that way, silly");
            }
            else {
                System.out.println(" i don't understand");
            }
        }
    }


    public String zeroZeroOutput(int inputKey){
        if (inputKey == 2){
            loc.setLocation(-1, 0);
            return " the alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...";
        }
        if (inputKey == 1){
            loc.setLocation(1, 0);
            return " the alleyway is littered with discarded old cardboard boxes.\n there is a large gate in front of you.";
        }
        else {
            return " i don't understand";
        }
    }

    // public void setAlleywayLocA(int inputKey){
    //     if (inputKey == 2){
    //         loc.setLocation(-1, 0);
    //         x = loc.getX();
    //         y = loc.getY();
    //     }
    //     if (inputKey == 1){
    //         loc.setLocation(1, 0);
    //         x = loc.getX();
    //         y = loc.getY();
    //     }
    // }

    public int negOneZeroInput(){
    // runs on the game loop if location = (-1,0) from going west
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "GO EAST";
            String case2 = "EAST";

            String case3 = "GO WEST";
            String case4 = "WEST";

            String case5 = "GO NORTH";
            String case6 = "NORTH";

            String case7 = "GO SOUTH";
            String case8 = "SOUTH";

            String case9 = "JUMP";

            if (userInput.equals(case1)|| userInput.equals(case2)){ // east
                change = 1;
                return change;
            }
            if (userInput.equals(case3) || userInput.equals(case4)){ // west
                change = 2;
                return change;
            } 
            if (userInput.equals(case9)){ // jump into apt
                change = 3;
                return change;
            }
            if (userInput.equals(case5)|| userInput.equals(case6)|| userInput.equals(case7)|| userInput.equals(case8)){ //north or south
                System.out.println(" you can't walk that way, silly");
            }
            else {
                System.out.println(" i don't understand");
            }
        }
    }
    
    public String negOneZeroOutput(int inputKey){
        // going east 
        if (inputKey == 1){
            loc.setLocation(0, 0);
            return " you're where you woke up in the back alleyway between some rows of apartments. \nlooks like you can only go east or west...";
        }
        // going west 
        if (inputKey == 2){
            loc.setLocation(-2, 0);
            return " you leave the alleyway and find yourself on a calm street. \n you have come to a crossroads...the only way forward is to walk is north or south.";
        }
        // going into the apartment 
        if (inputKey == 3){
            loc.setLocation(-1, 1);
            return " you jump onto the ledge and squeeze through the window. \n you jump down onto the carpeted floor and look around at the apartment. \n there's no one around, but there's a bowl of cat food sitting a few steps in front of you. \n your stomach grumbles... ";
        }
        else {
            return " i don't understand";
        }
    }


    // public void setAlleywayLocB(int inputKey){
    //     if (inputKey == 1){
    //         loc.setLocation(0, 0);
    //         x = loc.getX();
    //         y = loc.getY();
    //     }
    //     if (inputKey == 2){
    //         loc.setLocation(-2, 0);
    //         x = loc.getX();
    //         y = loc.getY();
    //     }
    //     if (inputKey == 3){
    //         loc.setLocation(-1, 2);
    //         x = loc.getX();
    //         y = loc.getY();
    //     }
    // }

    // public int getAlleywayX(){
    //     return x;
    // }

    // public int getAlleywayY(){
    //     return y;
    // }

    public Boolean isInAlleyway(location loc){
        int x = loc.getX();
        int y = loc.getY();

        if (x >= -2){
            if (x <= 1){
                if (y == 0){
                    return true;
                }
            }
        }
        return false;
    }


    public Boolean isInAlleywayB(location loc){
        int x = loc.getX();
        int y = loc.getY();

        if (x >= -2){
            if (x <= 1){
                if (y == 0){
                    return true;
                }
            }
        }
        return false;
    }



    // public static void main(String[] args) {
    //     alleyway alleyway = new alleyway();
    //     location location = new location();

    //     //true
    //     location.setLocation(0, 0);
    //     System.out.println(alleyway.isInAlleyway(location));

    //     //false
    //     location.setLocation(-4, 1);
    //     System.out.println(alleyway.isInAlleyway(location));

    //     //true
    //     location.setLocation(-2, 0);
    //     System.out.println(alleyway.isInAlleyway(location));

    //     //false
    //     location.setLocation(2, 0);
    //     System.out.println(alleyway.isInAlleyway(location));
    // }

}
