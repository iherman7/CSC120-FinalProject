public class IOtest {

    public IOtest(){

    }

    public int scenario1(){

        userIO userIO = new userIO(1);
        String userInput = userIO.readInput();

        String case1 = "hi";
        String case2 = "bye";
        String case3 = "help";

        if (userInput.equals(case1)){
            return 1;
        }
        if (userInput.equals(case2)){
            return 2;
        }
        if (userInput.equals(case3)){
            return 3;
        } else {
            return 0;
        }
    }


    public String scenario1output(int inputKey){
        if (inputKey == 1){
            return "hello";
        }
        if (inputKey == 2){
            return "goodbye";
        }
        if (inputKey == 3){
            return "ok";
        } else {
            return "i don't understand";
        }
    }

    public int scenario2(){

        userIO userIO = new userIO(1);
        String userInput = userIO.readInput();

        String case1 = "go north";
        String case2 = "go south";

        if (userInput.equals(case1)){
            return 1;
        }
        if (userInput.equals(case2)){
            return 2;
        } else {
            return 0;
        }
    }

    public String scenario2output(int inputKey){
        if (inputKey == 1){
            return "there is a tree";
        }
        if (inputKey == 2){
            return "you can't walk this way";
        } else {
            return "i don't understand";
        }
    }


}
