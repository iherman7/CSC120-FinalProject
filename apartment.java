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
            String case5 = "GO FORWARD";
            String case6 = "GO TO FOOD";


            // leave apartment
            if (userInput.equals(case1)|| userInput.equals(case2) || userInput.equals(case3)){ 
                change = 1;
            }

            // go to food bowl
            if (userInput.equals(case4)|| userInput.equals(case5)|| userInput.equals(case6)){
                change = 2;
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
        return " 'meowwwww!' a housecat jumps out from behind the couch and blocks your path. \n 'that's my food!' \n ... \n 'you look hungry...' \n"
        + " ok, i'll let you have some if you answer my three riddles. \n you have to know this town pretty well to ";
        } 
    else {
        return " i don't understand";
    }
    }
}

