public class gate extends location {
    
    private skeem player; 

    public gate(skeem player){
        this.player = player;
    }
        

    public int oneZeroInput(){

        userIO userIO = new userIO();
        String userInput = userIO.readInput();

        if (super.getX() == 1 && super.getY() == 0){
            String case1 = "WEST";
            String case2 = "GO WEST"; 

            if (player.hasKey() == false){ // need this condition; figure how to write it
                if (userInput.equals(case1)|| userInput.equals(case2)){
                    return 1;
                }
                else {
                    return 0; 
                }
            }
            else {
                if (userInput.equals(case1)|| userInput.equals(case2)){
                    return 2;
                }
                else {
                    return 3; 
                }
            }

    }

    }

    // set location
    //say you cannot do anything if boolean hasKey is false
    //if boolean hasKey is true and they have said something along the lines of use key, open gate
    //then the rest of the game can continue

public String oneZeroOutput(){

}
}
