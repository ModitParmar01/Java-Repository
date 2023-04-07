package Composition.SmartKitchen.src;

public class CoffeeMaker {
    private boolean hasWorkToDO;

    public void setHasWorkToDO(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }

    public void brewCoffee(){
        if(hasWorkToDO){
            System.out.println("The coffee is in making.");
            hasWorkToDO=false;
        }
    }
}
