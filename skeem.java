public class skeem {

    private boolean hasBone;
    private boolean sharpenClaws;
    private boolean hasKey;

    public skeem(){
        this.hasBone = false;
        this.sharpenClaws = false;
        this.hasKey = false;
    }


    public boolean hasKey(){ 
        return hasKey;
    }

    public void setKey(boolean k){
        hasKey = k;
    }

    public boolean hasBone(){ 
        return hasBone;
    }

    public void setBone(boolean b){
        hasKey = b;
    }

    public boolean sharpenClaws(){ 
        return sharpenClaws;
    }

    public void setClaw(boolean c){
        sharpenClaws = c;
    }
}
