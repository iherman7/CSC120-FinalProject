public class alleyway extends location {

    public int change = 0;
        
    public alleyway(){
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
            return " oh good! looks like you've finally woken up, sleepy head. \n it seems you shed the remains of your human body and have woken up as a cat. \n skeem, you must have had something weird to eat last night...you're far from home! \n you're in the back alleyway between some rows of apartments. \n looks like you can only go east or west...";
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
            
                if (userInput.equals(case1)|| userInput.equals(case2)){
                    change = 1;
                    return change;
                }
                if (userInput.equals(case3) || userInput.equals(case4)){
                    change = 2;
                    return change;
                } else {
                    System.out.println(" you can't walk that way, silly");
                }
            }
        }


    public String zeroZeroOutput(int inputKey){
        if (inputKey == 1){
            super.setLocation(-1, 0);
            return " the alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...";
        }
        if (inputKey == 2){
            super.setLocation(1, 0);
            return " the alleyway is littered with discarded old cardboard boxes.\n there is a large gate infront of you.";
        } else {
            return "you can't walk that way, silly.";
        }
    }

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
