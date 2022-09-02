package Polymorphoism;
public class Car {
    private String name;
    private boolean engine;
    private int cylinders=1;
    private int wheeels;
    private int doors;

    public Car(String name,boolean engine,int cylinders,int wheeels,int doors){
        this.name=name;
        this.cylinders=cylinders;
        this.engine=engine;
        this.wheeels=wheeels;
        this.doors=doors;
    }

    public void startEngine(){
        System.out.println("Engine of car is started");
    }

    public void accelerate(){
        System.out.println("car is accelerating.");
    }

    public void brake(){
        System.out.println("brake is applied on car");
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEngine() {
        return this.engine;
    }

    public boolean getEngine() {
        return this.engine;
    }

    public void setEngine(boolean engine) {
        this.engine = engine;
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getWheeels() {
        return this.wheeels;
    }

    public void setWheeels(int wheeels) {
        this.wheeels = wheeels;
    }

    public int getDoors() {
        return this.doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

}
