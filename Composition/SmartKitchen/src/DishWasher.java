package Composition.SmartKitchen.src;

public class DishWasher {
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO){
     this.hasWorkToDO=hasWorkToDO;
    }

    public void doDishes(){
        if(hasWorkToDO){
        System.out.println("dishes are washing");
        hasWorkToDO=false;
        }
    }
}
