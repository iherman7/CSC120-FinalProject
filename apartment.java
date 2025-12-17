public class apartment {
    
       
    public int change = 0;
    private skeem player;
    private location loc;
    public boolean housecatConvo = false;
    public boolean riddle1Answered = false;
    public boolean riddle2Answered = false;
    public boolean riddle3Answered = false;

    public apartment(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    public int negOneOneInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "LEAVE";
            String case2 = "JUMP"; // you should chnage this user wont say that to leave
            String case3 = "JUMP DOWN";

            String case4 = "FORWARD";
            String case5 = "GO FORWARD"; // closer, get closer
            String case6 = "GO TO FOOD";
            String case7 = "MOVE CLOSER";
            String case8 = "GO CLOSER";

            String case9 = "EAT FOOD";
            String case10 = "EAT";


            // leave apartment
            if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)){ 
                change = 1;
                return change;
            }

            // go to food bowl
            if (userInput.equals(case4)|| userInput.equals(case5)|| userInput.equals(case6) || userInput.equals(case7) || userInput.equals(case8)){
                change = 2;
                return change;
            }
            // tries to eat food
            if (userInput.equals(case9) || userInput.equals(case10)){
                change = 3;
                return change;
            }
            else {
            System.out.println("\n i don't understand \n");
            }
        
        }

    }

public String negOneOneOutput(int inputKey){
    // left apartment
    if (inputKey == 1){
        loc.setLocation(-1, 0);
        return "\n the alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment... \n";
        } 
    // went to food
    if (inputKey == 2){
        loc.setLocation(-1, 2);
        return "\n 'meowwwww!' a fat housecat jumps out from behind the couch and blocks your path. \n 'that's my food!' the fat housecat hisses at you, but softens with pity. \n 'but i do say, you look hungry... are you?' \n";
        } 
    // tried to eat food
    if (inputKey == 3){
        return "\n you're too far away! \n";
        } 
    else {
        return "\n i don't understand \n";
    }
    }

    // interaction with housecat in front of food bowl
    public int negOneTwoInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "WALK OUT";
            String case2 = "WALK AWAY";
            String case3 = "LEAVE APARTMENT";
            String case4 = "WALK TO WINDOW";
            String case5 = "LEAVE";

            String case6 = "YES"; // should you code a no

            // back to the window
            if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3) || userInput.equals(case4) || userInput.equals(case5)){ 
                change = 1;
                return change;
            }
            if (userInput.equals(case6)){ 
                change = 2;
                return change;
            }
            else {
                System.out.println("\n 'are you hungry?' the housecat says. \n");
            }
        
        }

    }

    public String negOneTwoOutput(int inputKey){
    // went back to window
    if (inputKey == 1){
        loc.setLocation(-1, 1);
        return "\n the alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...\n";
        } 
    // went to food
    if (inputKey == 2){
        housecatConvo = true;
        return "\n 'i haven't seen you around here before,' the housecat replies. \n 'you must be a long way from home. \n because i am so kind and generous, i'll let you have some of my food...but only if you answer my three riddles. \n do you want to hear the first one?'\n"; 
        } 
    else {
        return "\n i don't understand\n";
    }
    }

    // riddle 1
    public int riddle1Input(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "YES";

            String case2 = "NO";

            // yes
            if (userInput.equals(case1)){ 
                change = 1;
                return change;
            }
            // no
            if (userInput.equals(case2)){ 
                change = 2;
                return change;
            }
            else {
                System.out.println("\n i don't understand\n");
            }
        
        }

    }

    public String riddle1Output(int inputKey){
    // yes
    if (inputKey == 1){
        return "\n 'okay, your first riddle is: \n what is a fishmonger's favorite song?'\n";
        } 
    // no
    if (inputKey == 2){
        loc.setLocation(-1, 1);
        return "\n 'okay, starve then...' \n the housecat walks away in disappointment.\n"; // in play through this bit is confusing
        } 
    else {
        return "\n i don't understand\n";
    }
    }


    // riddle 2
    public int riddle2Input(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "SEABIRD";
            String case2 = "SEA BIRD";

            String case3 = "WALK OUT";
            String case4 = "WALK AWAY";
            String case5 = "LEAVE APARTMENT";
            String case6 = "WALK TO WINDOW";
            String case7 = "LEAVE";
            String case8 = "I GIVE UP";
            String case9 = "GIVE UP";


            // correct
            if (userInput.equals(case1) || userInput.equals(case2)){ 
                change = 1;
                return change;
            }
            // give up or try to leave
            if (userInput.equals(case3) || userInput.equals(case4) || userInput.equals(case5) || userInput.equals(case6) || userInput.equals(case7) || userInput.equals(case8) || userInput.equals(case9)){ 
                change = 2;
                return change;
            }
            else {
                System.out.println("\n 'no, that's not it... \n maybe visit the fish market in town to find out.'\n");
            }
        
        }

    }

    public String riddle2Output(int inputKey){
    // correct
    if (inputKey == 1){
        riddle1Answered = true;
        return "\n 'correct! i'm impressed, but i don't think you'll get my next one... \n how long has fido been blue?'\n";
        } 
    // give up
    if (inputKey == 2){
        loc.setLocation(-1, 1);
        return "\n 'okay, starve then...' \n the housecat walks away in disappointment.\n"; 
        } 
    else {
        return "\n i don't understand\n";
    }
    }

    // riddle 3
    public int riddle3Input(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "7 YEARS";
            String case2 = "SEVEN YEARS";
            String case3 = "FOR SEVEN YEARS";
            String case4 = "FOR 7 YEARS";

            String case5 = "WALK OUT";
            String case6 = "WALK AWAY";
            String case7 = "LEAVE APARTMENT";
            String case8 = "WALK TO WINDOW";
            String case9 = "LEAVE";
            String case10 = "I GIVE UP";
            String case11 = "GIVE UP";


            // correct
            if (userInput.equals(case1) || userInput.equals(case2) || userInput.equals(case3) || userInput.equals(case4)){ 
                change = 1;
                return change;
            }
            // give up or try to leave
            if (userInput.equals(case5) || userInput.equals(case6) || userInput.equals(case7) || userInput.equals(case8) || userInput.equals(case9) || userInput.equals(case10) || userInput.equals(case11)){ 
                change = 2;
                return change;
            }
            else {
                System.out.println("\n 'not even close. \n but i wonder where he hangs out these days...'\n");
            }
        
        }

    }

    public String riddle3Output(int inputKey){
    // correct
    if (inputKey == 1){
        riddle2Answered = true;
        return "\n 'correct again! wow, you must have been around this town awhile. \n ok, here's your final riddle: \n what's the street that leads a lost cat back home?'\n";
        } 
    // give up
    if (inputKey == 2){
        loc.setLocation(-1, 1);
        return "\n 'okay, starve then...' \n the housecat walks away in disappointment.\n"; 
        } 
    else {
        return "\n i don't understand\n";
    }
    }

    // final interaction with housecat
    public int finalHousecatInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "HARBOR LANE";
            String case2 = "HARBOR LN";

            String case3 = "WALK OUT";
            String case4 = "WALK AWAY";
            String case5 = "LEAVE APARTMENT";
            String case6 = "WALK TO WINDOW";
            String case7 = "LEAVE";
            String case8 = "I GIVE UP";
            String case9 = "GIVE UP";

            // correct
            if (userInput.equals(case1) || userInput.equals(case2)){ 
                change = 1;
                return change;
            }
            // give up or try to leave
            if (userInput.equals(case3) || userInput.equals(case4) || userInput.equals(case5) || userInput.equals(case6) || userInput.equals(case7) || userInput.equals(case8) || userInput.equals(case9)){ 
                change = 2;
                return change;
            }
            else {
                System.out.println("\n 'haha, maybe next time. \n there's a lot more to this town than you think.'\n");
            }
        
        }

    }

    public String finalHousecatOutput(int inputKey){
    // correct and eat food
    if (inputKey == 1){
        player.setFull(true);
        riddle3Answered = true;
        return "\n 'congratulations, you've earned it.' \n the housecat steps aside, allowing you to step forward and eat the food. \n it's delicious, and as you leave the apartment and jump back down to the alleyway you immediately feel more energetic and courageous...\n";
        } 
    // give up
    if (inputKey == 2){
        loc.setLocation(-1, 1);
        return "\n 'okay, starve then...' \n the housecat walks away in disappointment.\n"; 
        } 
    else {
        return "\n i don't understand\n";
    }
    }
}

