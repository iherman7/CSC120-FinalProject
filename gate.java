public class gate extends location {

    public gate(){
        
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


    // set location
    //say you cannot do anything if boolean hasKey is false
    //if boolean hasKey is true and they have said something along the lines of use key, open gate
    //then the rest of the game can continue
    
}
