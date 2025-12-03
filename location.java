public class location {
    
    public coordPair currentLocation = new coordPair(0, 0);
    int x;
    int y;

    public location(){
    }

    public int getX(){
        x = currentLocation.getX();
        return x;
    }

    public int getY(){
        y = currentLocation.getY();
        return y;
    }

    public void setLocation(int x, int y){
        currentLocation.setX(x);
        currentLocation.setY(y);
    }

    public static void main(String[] args) {
        location location = new location();
        
        // 0
        int test1 = location.getX();
        System.out.println(test1);

        // 0
        int test2 = location.getY();
        System.out.println(test2);

        //1
        location.setLocation(0, 1);
        int test3 = location.getY();
        System.out.println(test3);


        //3
        location.setLocation(3, 5);
        int test4 = location.getX();
        System.out.println(test4);
    }
}