/**
 * This class keeps track of the player's location using x and y coordinates.
 */
public class location {
    
    /**
     * Attributes
     */
    private coordPair currentLocation;
    int x;
    int y;

    /**
     * Constructor
     */
    public location(){
        this.currentLocation = new coordPair(0, 0);
    }

    /**
     * Accessor for x coordinate
     * @return x current x coordinate
     */
    public int getX(){
        x = currentLocation.getX();
        return x;
    }

    /**
     * Accessor for y coordinate
     * @return y current y coordinate
     */
    public int getY(){
        y = currentLocation.getY();
        return y;
    }

    /**
     * Manipulator for both coordinates
     * @param x x coordinate
     * @param y y coordinate
     */
    public void setLocation(int x, int y){
        currentLocation.setX(x);
        currentLocation.setY(y);
    }
}