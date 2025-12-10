public class apartment {
    
       
    public int change = 0;
    private skeem player;
    private location loc;

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
            String case2 = "JUMP";
            String case3 = "JUMP UP";

            String case4 = "FORWARD";
            String case5 = "GO FORWARD"; // closer, get closer
            String case6 = "GO TO FOOD";

            String case7 = "EAT FOOD";


            // leave apartment
            if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)){ 
                change = 1;
                return change;
            }

            // go to food bowl
            if (userInput.equals(case4)|| userInput.equals(case5)|| userInput.equals(case6)){
                change = 2;
                return change;
            }
            // tries to eat food
            if (userInput.equals(case7)){
                change = 3;
                return change;
            }
            else {
            System.out.println(" i don't understand");
            }
        
        }

    }

public String negOneOneOutput(int inputKey){
    // left apartment
    if (inputKey == 1){
        loc.setLocation(-1, 0);
        return " the alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...";
        } 
    // went to food
    if (inputKey == 2){
        loc.setLocation(-1, 2);
        return " 'meowwwww!' a fat housecat jumps out from behind the couch and blocks your path. \n 'that's my food!' the fat housecat hisses at you, but softens with pity \n 'but i do say you look hungry, are you?'";
        } 
    // tried to eat food
    if (inputKey == 3){
        return " you're too far away!";
        } 
    else {
        return " i don't understand";
    }
    }

    // interaction with housecat
    public int negOneTwoInput(){
        while (true){
            change = 0;
            userIO userIO = new userIO();
            String userInput = userIO.readInput();

            String case1 = "WALK OUT";
            String case2 = "WALK AWAY";
            String case3 = "LEAVE APARTMENT";
            String case4 = "WALK TO WINDOW";

            String case5 = "YES";
            // String case6 = 
            // String case7 = 


            // back to the window
            if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3) || userInput.equals(case4)){ 
                change = 1;
                return change;
            }
            if (userInput.equals(case5)){ 
                change = 2;
                return change;
            }
            else {
                System.out.println(" are you hungry?");
            }
        
        }

    }

    public String negOneTwoOutput(int inputKey){
    // went back to window
    if (inputKey == 1){
        loc.setLocation(-1, 1);
        return " lololthe alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...";
        } 
    // went to food
    if (inputKey == 2){
        loc.setLocation(-1, 2);
        return " ' i haven't seen you around here before,' the housecat replies. \n 'you must be a long way from home' \n 'because i am so kinda and generous, i'll let you have some of my food...but only if you answer my three riddles.' \n 'do want to hear the first one?'"; 
        } 
    else {
        return " i don't understand";
    }
    }
    
}

