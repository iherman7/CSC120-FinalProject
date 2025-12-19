/**
 * This class allows the program to keep track of the player's progress.
 */
public class skeem {

    /**
     * Attributes
     */
    private boolean hasBone;
    private boolean sharpenClaws;
    private boolean hasKey;
    private boolean eatFood;
    private boolean dogHasBone;
    private boolean gateOpen;

    /**
     * Constructor
     */
    public skeem(){
        this.hasBone = false;
        this.sharpenClaws = false;
        this.hasKey = false;
        this.eatFood = false;
        this.dogHasBone = false;
    }

    /**
     * Accessor for hasKey
     * @return this.hasKey if the player has obtained the key or not
     */
    public boolean hasKey(){ 
        return this.hasKey;
    }

    /**
     * Manipulator for hasKey
     * @param k boolean value indicating if the player has obtained the key or not
     */
    public void setKey(boolean k){
        this.hasKey = k;
    }

    /**
     * Accessor for hasBone
     * @return this.hasBone if the player has obtained the bone or not
     */
    public boolean hasBone(){ 
        return this.hasBone;
    }

    /**
     * Manipulator for hasBone
     * @param b boolean value indicating if the player has obtained the bone or not
     */
    public void setBone(boolean b){
        this.hasBone = b;
    }

    /**
     * Accessor for sharpenClaws
     * @return this.sharpenClaws if the player has sharpened claws or not
     */
    public boolean sharpenClaws(){ 
        return this.sharpenClaws;
    }

    /**
     * Manipulator for sharpenClaws
     * @param c boolean value indicating if the player has sharpened claws or not
     */
    public void setClaw(boolean c){
        this.sharpenClaws = c;
    }

    /**
     * Accessor for eatFood
     * @return this.eatFood if the player has eaten food or not
     */
    public boolean eatFood(){
        return this.eatFood;
    }

    /**
     * Manipulator for eatFood
     * @param f boolean value indicating if the player has eaten food or not
     */
    public void setFull(boolean f){
        this.eatFood = f;
    }

    /**
     * Accessor for dogHasBone
     * @return this.dogHasBone if the player has given the dog the bone or not
     */
    public boolean dogHasBone(){
        return this.dogHasBone;
    }

    /**
     * Manipulator for dogHasBone
     * @param d boolean value indicating if the player has given the dog the bone or not
     */
    public void setDogHasBone(boolean d){
        this.dogHasBone = d;
    }

    /**
     * Accessor for gateOpen
     * @return this.gateOpen if the player has opened the gate or not
     */
    public boolean gateOpen(){
        return this.gateOpen;
    }

    /**
     * Manipulator for gateOpen
     * @param g boolean value indicating if the player has opened the gate or not
     */
    public void setGate(boolean g){
        this.gateOpen = g;
    }
}
