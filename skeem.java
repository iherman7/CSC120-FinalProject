public class skeem {

    private boolean hasBone;
    private boolean sharpenClaws;
    private boolean hasKey;

    public skeem(){
        this.hasBone = false;
        this.sharpenClaws = false;
        this.hasKey = false;
    }

    public skeem(skeem player) {
        this.hasBone = player.hasBone;
        this.hasKey = player.hasKey;
        this.sharpenClaws = player.sharpenClaws;
    }

    public boolean hasKey(){ 
        return hasKey;
    }

    public boolean hasBone(){ 
        return hasBone;
    }

    public boolean sharpenClaws(){ 
        return sharpenClaws;
    }
}
