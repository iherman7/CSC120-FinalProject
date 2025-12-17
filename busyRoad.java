import java.util.Random;

public class busyRoad {

    private skeem player;
    private location loc;
    public int change = 0;
    private static final String SUCCESS = " \n Skeem you dashed across the busy road safely and have finally reached your home! congragulations!\n ";
    private static final String[] RESPONSES = {
        "\n a car flies by too close, oh no! You jump back.\n",
        "\n you hesitate overcome with fear. it doesn't feel safe yet.\n",
        "\n A huge truck honks. oh no definitely not.\n",
        "\n you feel the wind of the cars whoosh past your face, still no opening.\n",
        "\n a car throws litter out of it's window and it hits you square in the face, you're gonna need a second to live that one down.\n",
        "\n you tried to cross and a semi truck hit you, yikes! good thing you have nine lives.\n",
        SUCCESS 
    };

    public busyRoad(skeem player, location loc){
        this.player = player;
        this.loc = loc;
    }
    
    public int threeZeroInput(){
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

            String case9 = "CROSS";
            String case10 = "CROSS STREET";

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
            if (userInput.equals(case9)|| userInput.equals(case10)){
                change = 5;
                return change;
            }
            else{
                System.out.println("\n why would you type that, i don't understand\n");
            }
        }
    }
}
