public class park {

    private skeem player;
    private location loc;
    public int change = 0;

    public park (skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }

    //park is at loc (-2,-3) & (-1,-3) & (-2,-4) & (-1,-4)
    public int negTwoNegThreeInput(){
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
                    return change;
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
                System.out.println(" what bone?");
                continue;
            }
            }
            else{
                System.out.println(" why would you type that, i don't understand");
            }
        }
    }

    public String negTwoNegThreeOutput(int inputKey){
        //east
        if (inputKey == 1){
        return " the dog approaches you 'you cats think you can just walk and around anywhere, well i used to run around when my owner would throw a bone in my prime days. this is still MY park stay out! \n he barks you off \n if only there were a way to distract him";
        }
        //go north
        if (inputKey == 2){
            loc.setLocation(-2, -1);
            return " you are now on the calm street infront of leaning tree park...to go north or south...what to do...";
        }
        //go south
        if (inputKey == 3){
            return " the dog approaches you bearing it's canines, a growl ready to release \n 'this is MY park you can't enter.' the dog looks at you serverly. \n 'after my owner stopped playing with me to spend more time with his new cat,' he snarls \n 'you especially aren't welcomed here.' \n he barks you off \n if only there was a way to distract him";
        }
        //go west
        if (inputKey == 4){
            return " there's nothing over here but a beautiful overview of the ocean glimmering back at fisher's cove";
        }
        //go east if have fish bone
        if (inputKey == 5){
            return " the dog approaches you again and blocks your path 'didn't i tell you to stay away from my--' he is suddenly distracted by the bone you have in your mouth. \n he seems to be enammored by it...";
        }
        //go south if fish bone
        if (inputKey == 6){
            return " the dog approaches you again and blocks your path 'you cats just don't listen, this is my--' he is lost in lust by the bone you have in your mouth. \n he seems to be enammored by it...";
        }
        //throw bone
        if (inputKey == 7){
            return " the dog chases after the bone with exuberant joy 'oh man i haven't felt such thrill like this in seven years' \n the park that continues east or south is now free to roam!";
        }
        else{
            return " why would you type that, i dont understand";
        }
    }

    public int nextmove 

}
