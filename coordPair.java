/**
 * This class creates a coordinate pair that can be used to keep track of the player's location.
 */
public class coordPair {
    
    /**
     * Attributes
     */
    int x;
    int y;

    /**
     * Constructor
     */
    public coordPair(int x, int y){
        this.x = x;
        this.y = y;
    }

    /**
     * Accessor for x coordinate
     * @return x coordinate
     */
    public int getX(){
        return this.x;
    }

    /**
     * Accessor for y coordinate
     * @return y coordinate
     */
    public int getY(){
        return this.y;
    }

    /**
     * Manipulator for x coordinate
     * @param x coordinate
     */
    public void setX(int x){
        this.x = x;
    }

    /**
     * Manipulator for y coordinate
     * @param y coordinate
     */
    public void setY(int y){
        this.y = y;
    }
}
