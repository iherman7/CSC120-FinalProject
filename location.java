public class location {
    
    coordPair currentLocation = new coordPair(0, 0);
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

    // public static void main(String[] args) {
    //     location location = new location();
    //     location.setLocation(1, 1);
    //     System.out.println(location.getX());
    //     System.out.println(location.getY());
    // }

}