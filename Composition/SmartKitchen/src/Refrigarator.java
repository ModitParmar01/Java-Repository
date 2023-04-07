package Composition.SmartKitchen.src;

public class Refrigarator {
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }

    public void orderFood(){
        if(hasWorkToDO){
            System.out.println("ordering food.");
            hasWorkToDO=false;
        }
    }
    
}
