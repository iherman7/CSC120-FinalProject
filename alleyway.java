import java.util.ArrayList;

public class alleyway{

    // coordPair zeroZero = new coordPair(0, 0);
    // coordPair nOneZero = new coordPair(-1, 0);
    // coordPair nTwoZero = new coordPair(-2, 0);
    // coordPair oneZero = new coordPair(1, 0);

    // ArrayList<coordPair> alleywayCoords = new ArrayList<coordPair>();

    public alleyway(){
        // alleywayCoords.add(zeroZero);
        // alleywayCoords.add(nOneZero);
        // alleywayCoords.add(nTwoZero);
        // alleywayCoords.add(oneZero);
    }

    public int openingInput(){

        userIO userIO = new userIO();
        String userInput = userIO.readInput();

        String case1 = "WAKE UP";

        if (userInput.equals(case1)){
            return 1;
        } else {
            return 0;
        }
    }


    public String openingOutput(int inputKey){
        if (inputKey == 1){
            return " oh good! looks like you've finally woken up, sleepy head. \n it seems you shed the remains of your human body and have woken up as a cat. \n skeem, you must have had something weird to eat last night...you're far from home! \n you're in the back alleyway between some rows of apartments. \n looks like you can only go east or west...";
        } else {
            return " i don't understand";
        }
    }

    public int zeroZero(){

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
        } else {
            return 0;
        }
    }


    public String zeroZero(int inputKey){
        if (inputKey == 1){
            //set coordinates
            return " the alleyway continues ahead. \n it is littered with fish bones and discarded old cardboard boxes.";
        }
        if (inputKey == 2){
            //set coordinates
            return " the alleyway opens into a street ahead! \n there's also a ledge above, leading to an ajar window. \n if you jumped high enough, maybe you could sneak into that apartment...";
        } else {
            return " i don't understand";
        }
    }

    public Boolean isInAlleyway(){
        location current = new location();
        int x = current.getX();
        int y = current.getY();

        // ArrayList<Integer> alleywayXCoords = new ArrayList<>();

        // alleywayXCoords.add(-2);
        // alleywayXCoords.add(-1);
        // alleywayXCoords.add(0);
        // alleywayXCoords.add(1);

        // for (int i = 0; i <= 3; i++){

        //     int check = alleywayXCoords.get(i);

        //     if (check == x){
        //         if (check == y){
        //             return true
        //         }
        //     }
        // }
        if (x >= -2 && x <= 1){
            if (y == 0){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        alleyway alleyway = new alleyway();
        location location = new location();

        //true
        location.setLocation(0, 0);
        System.out.println(alleyway.isInAlleyway());

        //false
        location.setLocation(0, 1);
        System.out.println(alleyway.isInAlleyway());

        //true
        location.setLocation(-2, 0);
        System.out.println(alleyway.isInAlleyway());

        //true
        location.setLocation(1, 0);
        System.out.println(alleyway.isInAlleyway());
    }

}
