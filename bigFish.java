public class bigFish extends item{ //we do not need this class could be a thing for skeem

    boolean eatFish;

    public bigFish(String name){
        super(name);
        this.eatFish = false;
    }

    // the fish becomes the bone
    public boolean eatFish(){
        System.out.println("Woah, you demolished that fish, and all that is left are the bones");
        return (this.eatFish = true);
    }
}