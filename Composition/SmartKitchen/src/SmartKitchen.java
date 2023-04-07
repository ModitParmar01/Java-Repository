package Composition.SmartKitchen.src;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private Refrigarator icebox;
    private DishWasher washerMan;

    public SmartKitchen(){
        brewMaster = new CoffeeMaker();
        icebox = new Refrigarator();
        washerMan = new DishWasher();
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishFlag){
        brewMaster.setHasWorkToDO(coffeeFlag);
        icebox.setHasWorkToDO(fridgeFlag);
        washerMan.setHasWorkToDO(dishFlag);
    }

    public void doKitchenWork(){
        brewMaster.brewCoffee();
        icebox.orderFood();
        washerMan.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return this.brewMaster;
    }

    public Refrigarator getIcebox() {
        return this.icebox;
    }

    public DishWasher getWasherMan() {
        return this.washerMan;
    }
    
}
