public class item {
    
    protected String name;
    protected boolean status;

    public item(String name){
        this.name = name;
        this.status = false;
    }

    public void pickUp(){
        this.status = true;
    }

    public void putDown(){
        this.status = false;
    }

}
