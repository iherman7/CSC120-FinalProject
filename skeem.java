public class skeem {

    private boolean hasBone;
    private boolean sharpenClaws;
    private boolean hasKey;
    private boolean eatFood;
    private boolean dogHasBone;
    private boolean gateOpen;

    public skeem(){
        this.hasBone = false;
        this.sharpenClaws = false;
        this.hasKey = false;
        this.eatFood = false;
        this.dogHasBone = false;
    }


    public boolean hasKey(){ 
        return this.hasKey;
    }
    public void setKey(boolean k){
        this.hasKey = k;
    }

    public boolean hasBone(){ 
        return this.hasBone;
    }
    public void setBone(boolean b){
        this.hasBone = b;
    }

    public boolean sharpenClaws(){ 
        return this.sharpenClaws;
    }
    public void setClaw(boolean c){
        this.sharpenClaws = c;
    }

    public boolean eatFood(){
        return this.eatFood;
    }
    public void setFull(boolean f){
        this.eatFood = f;
    }

     public boolean dogHasBone(){
        return this.dogHasBone;
    }
    public void setDogHasBone(boolean d){
        this.dogHasBone = d;
    }

    public boolean gateOpen(){
        return this.gateOpen;
    }
    public void setGate(boolean g){
        this.gateOpen = g;
    }
}
