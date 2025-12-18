public class location {
    
   private coordPair currentLocation;
    int x;
    int y;

    public location(){
        this.currentLocation = new coordPair(0, 0);
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
}