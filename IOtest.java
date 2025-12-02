public class IOtest {

    public IOtest(){

    }

//testing opening scene
    public int scene1input(){

        userIO userIO = new userIO();
        String userInput = userIO.readInput();

        String case1 = "WAKE UP";

        if (userInput.equals(case1)){
            return 1;
        // }
        // if (userInput.equals(case2)){
        //     return 2;
        // }
        // if (userInput.equals(case3)){
        //     return 3;
        } else {
            return 0;
        }
    }


    public String scene1output(int inputKey){
        if (inputKey == 1){
            return "oh good! looks like you've finally woken up, sleepy head. \n it seems you have shed the remains of your human body and have woken up as a cat. \n skeem, you must have had something weird to eat last night. \n it looks like you're far from home, oh no! \n from what you can see, you're in the back alleyway of some row of apartments. \n looks like you can only go east or west...";
        // }
        // if (inputKey == 2){
        //     return "goodbye";
        // }
        // if (inputKey == 3){
        //     return "ok";
        } else {
            return "i don't understand";
        }
    }


    public int scene2input(){

        userIO userIO = new userIO();
        String userInput = userIO.readInput();

        String case1 = "GO EAST";
        String case2 = "EAST";
        String case3 = "GO WEST";
        String case4 = "WEST";

        if (userInput.equals(case1)|| userInput.equals(case2)){
            return 1;
        }
        if (userInput.equals(case3) || userInput.equals(case4)){
            return 2;
        // }
        // if (userInput.equals(case3)){
        //     return 3;
        } else {
            return 0;
        }
    }


    public String scene2output(int inputKey){
        if (inputKey == 1){
            //set coordinates
            return "the alleyway continues ahead. \n it is littered with fish bones and discarded old cardboard boxes.";
        }
        if (inputKey == 2){
            //set coordinates
            return "the alleyway opens into a street ahead... \\n" + 
                                "there is also a ledge above, connected to a slightly ajar window. \\n" + //
                                " if you jumped high enough, maybe you could sneak into this apartment.";
        // }
        // if (inputKey == 3){
        //     return "ok";
        } else {
            return "i don't understand";
        }
    }

    // public int scenario2(){

    //     userIO userIO = new userIO();
    //     String userInput = userIO.readInput();

    //     String case1 = "go north";
    //     String case2 = "go south";

    //     if (userInput.equals(case1)){
    //         return 1;
    //     }
    //     if (userInput.equals(case2)){
    //         return 2;
    //     } else {
    //         return 0;
    //     }
    // }

    // public String scenario2output(int inputKey){
    //     if (inputKey == 1){
    //         return "there is a tree";
    //     }
    //     if (inputKey == 2){
    //         return "you can't walk this way";
    //     } else {
    //         return "i don't understand";
    //     }
    // }


}
