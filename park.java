public class park {

    private skeem player;
    private location loc;
    public int change = 0;

    public park (skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    //park is at loc (-2,-3) & (-1,-3) & (-2,-4) & (-1,-4)--tree clibimg
    public int negTwoNegThreeInput(){ // might have to set a condition of what happens when dog has bone?
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

            String case9 = "THROW BONE";
            String case10 = "THROW FISH BONE";
            String case11 = "GIVE BONE";
            String case12 = "GIVE A DOG A BONE"; // could make a special output for this one


            if (userInput.equals(case1)|| userInput.equals(case2)){
                if (player.hasBone() == true){
                    change = 5;
                    return change; //east - changes with dog
                }
                if (player.hasBone() == false){
                    change = 1;
                    return change; // east
                }
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change;//north 
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                if (player.hasBone() == true){
                    change = 6;
                    return change; // has dog bone
                }
                if (player.hasBone() == false){
                    change = 3;
                    return change; //does not
                }
                 //south - changes with dog
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            if (userInput.equals(case9)||userInput.equals(case10)||userInput.equals(case11)||userInput.equals(case12)){
                if (player.hasBone()==true){ 
                change = 7;
                return change;
                }
            else {
                System.out.println("\n what bone?\n");
                continue;
            }
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        }
    }

    public String negTwoNegThreeOutput(int inputKey){
        //east
        if (inputKey == 1){
        return "\n the dog approaches you. \n 'you cats think you can just walk around anywhere! well, i used to run around when my owner would throw a bone in my prime days. this is still MY park, stay out! \n if only there were a way to distract him. \n he barks you off.\n";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(-2, -2);
            return "\n you are now on the calm street in front of leaning tree park...to go north or south...what to do...\n";
        }
        //go south
        if (inputKey == 3){
            return "\n the dog approaches you bearing its canines, a growl ready to release. \n 'this is MY park you can't enter.' the dog looks at you serverly. \n 'after my owner stopped playing with me to spend more time with his new cat,' he snarls, \n 'you especially aren't welcomed here.' \n if only there was a way to distract him... \n he barks you off. \n";
        }
        //go west
        if (inputKey == 4){
            return "\n there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove\n";
        }
        //go east if have fish bone
        if (inputKey == 5){
            return "\n the dog approaches you again and blocks your path. \n 'didn't i tell you to stay away from my--' he is suddenly distracted by the bone you have in your mouth. \n he seems to be enamored by it...\n";
        }
        //go south if fish bone
        if (inputKey == 6){
            return "\n the dog approaches you again and blocks your path. \n 'you cats just don't listen, this is my--' he is lost in lust by the bone you have in your mouth. \n he seems to be enamored by it...\n";
        }
        //throw bone
        if (inputKey == 7){
            player.setDogHasBone(true);
            return "\n the dog chases after the bone with exuberant joy. \n 'OH MAN, I HAVEN'T FELT SUCH THRILL LIKE THIS IN SEVEN YEARS!' \n you are now free to roam the leaning tree park to the east or south!\n";
        }
        else{
            return "\n why would you type that, i dont understand\n";
        }
    }

    public int nextMoveInput(){
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

    public String nextMoveOutput(int inputKey){
        //go east
        if (inputKey == 1){
            loc.setLocation(-1,-3);
            return "\n beautiful calm senerenity, you see the leaning tree to your south\n";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(-2, -2);
            return "\n you are now on the calm street infront of leaning tree park...to go north or south...what to do...\n";
        }
        //go south
        if (inputKey == 3){
            loc.setLocation(-2, -4); 
            return "\n sigh, what a nice park, you see the centerpice, the leaning tree to your east\n";
        }
        //go west
        if (inputKey == 4){
            return "\n there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove\n";
        }
        else{
            return "\n why would you type that, i dont understand\n";
        }
    }

    public int negTwoNegFourInput(){
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

            String case9 = "CLIMB";
            String case10 = "CLIMB TREE";

            //string case for climb tree

            if (userInput.equals(case1)|| userInput.equals(case2)){
                if (player.hasKey()==false){
                    change = 1;
                    return change; //east if no key
                }
                if (player.hasKey()==true){
                    change = 7;
                    return change; // east if key
                }
            }
             if (userInput.equals(case3)|| userInput.equals(case4)){
                change = 2;
                return change; //north
            }
             if (userInput.equals(case5)|| userInput.equals(case6)){
                change = 3;
                return change; //south
            }
             if (userInput.equals(case7)|| userInput.equals(case8)){
                change = 4;
                return change; //west
            }
            if (userInput.equals(case10)|| userInput.equals(case9)){
                if (player.sharpenClaws()==false){
                    change = 5;
                    return change; //not sharp claw
                }
                if (player.sharpenClaws()==true){
                    change = 6;
                    return change; //sharpen claws
                }
                if (player.hasKey()==true){
                    change = 8;
                    return change; // climb if already have key
                }
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        }
    }

    public String negTwoNegFourOutput(int inputKey){
        //go east - you cant go east there is the tree that blocks ur path u see somtheting shiny
        if (inputKey == 1){
            return "\n the large leaning tree block your path, you cannot continue east. \n you take a second to admire the beautiful yet odd tree and notice something shiny up high in the leaves of the branches. \n it intrigues you.\n";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(-2, -3);
            return "\n the scenery of the park has really impressed you. \n the gate to leave is in front of you if you choose to return to the calm street.\n";
        }
        //go south
        if (inputKey == 3){
            return "\n you have reached the end of the park. \n all there is from here are bushes that you are sure will only reveal another beautiful view of the ocean\n";
        }
        //go west
        if (inputKey == 4){
            return "\n there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove\n";
        }
        // climb tree but claws arent sharp
        if (inputKey == 5){
            return "\n you try to climb the tree but no success! you're claws just aren't sharp enough, skeem. \n i wonder if there's anything sharp around to sharpen them with...\n";
        }
        // climbing the tree
        if (inputKey == 6){
            player.setKey(true);
            return "\n with your newly sharpened claws you climb up the tree and discover a key! \n you grab it with your cat mouth and climb back down. \n where to next?\n";
        }
        //climbing tree if already have key
        if (inputKey == 7){
            return "\n you climbed the tree! that was fun i guess.";
        }
        // east if you already have key
        if (inputKey == 8){
            return " the large leaning tree block your path, you cannot continue east. \n you take a second to admire the beautiful yet odd tree.\n you've climbed it before, you could climb it again although, don't know why you would";
        }
        else{
            return "\n why would you type that, i dont understand\n";
        }
    }

    public int negOneNegThreeInput(){
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

        String case9 = "CLIMB";
        String case10 = "CLIMB TREE";

        if (userInput.equals(case1)|| userInput.equals(case2)){
            change = 1;
            return change; //east
        }
         if (userInput.equals(case3)|| userInput.equals(case4)){
            change = 2;
            return change; //north
        }
        if (userInput.equals(case5)|| userInput.equals(case6)){
            if (player.hasKey()==false){
                change = 3;
                return change; //south if player does not have key
            }
            if (player.hasKey()==true){
                change = 8;
                return change; // south if player does have key
            }
        }
        if (userInput.equals(case7)|| userInput.equals(case8)){
            change = 4;
            return change; //west
        }
        if (userInput.equals(case10)|| userInput.equals(case9)){
            if (player.sharpenClaws()==false){
                change = 5;
                return change; //not sharp claw
            }
            if (player.sharpenClaws()==true){
                change = 6;
                return change; //sharpen claws
            }
            if (player.hasKey()==true){
                change = 7;
                return change; // climb if has key already
            }
        }
        else{
            System.out.println("\n why would you type that, i don't understand\n");
        }
        }
    }

    public String negOneNegThreeOutput(int inputKey){
        //go east - you cant go east end of park
        if (inputKey == 1){
            return "\n you have reached the edge of the park. \n all there is from here are bushes that you are sure will only reveal another beautiful view of the ocean\n";
        }
        //go north -- cant go north, edge of park
        if (inputKey == 2){
            return "\n you have reached the edge of the park. \n all there is from here are bushes that you are sure will only reveal another beautiful view of the ocean\n";
        }
        //go south // cant go south tree block ur path
        if (inputKey == 3){
            return "\n the large leaning tree block your path, you cannot continue south. \n you take a second to admire the beautiful yet odd tree and notice something shiny up high in the leaves of the branches \n it intrigues you.\n";
        }
        //go west // palces u back
        if (inputKey == 4){
            loc.setLocation(-2, -3);
            return "\n the scenery of the park has really impressed you. \n the gate to leave is north of you if you choose to return to the calm street.\n";
        }
         if (inputKey == 5){
            return "\n you try to climb the tree but no success! \n your claws just aren't sharp enough, skeem. i wonder if there's anything sharp around to sharpen them with...\n";
        }
        if (inputKey == 6){
            player.setKey(true);
            return "\n with your newly sharpened claws you climb up the tree and discover a key! \n you grab it with your cat mouth and climb back down. \n where to next?\n";
        }
        if (inputKey == 7){
            return "\n you climbed the tree! that was fun i guess.";
        }
        if (inputKey == 8){
            return " the large leaning tree block your path, you cannot continue south. you take a second to admire the beautiful yet odd tree.\n you've climbed it before, you could climb it again although, don't know why you would";
        }
        else {
            return "\n why would you type that, i dont understand\n";
        }
    }
}

