package Composition.src;

public class Fan {

    private int noOfFans;
    private int noOfWings;
    private String manufracturer;
    private String Color;
    private int powerConsuption;
    private Dimensions dimensionOfan;


    public Fan(int noOfFans, int noOfWings, String manufracturer, String Color, int powerConsuption, Dimensions dimensionOfan) {
        this.noOfFans = noOfFans;
        this.noOfWings = noOfWings;
        this.manufracturer = manufracturer;
        this.Color = Color;
        this.powerConsuption = powerConsuption;
        this.dimensionOfan = dimensionOfan;
    }

    public int getNoOfFans() {
        return this.noOfFans;
    }

    public void setNoOfFans(int noOfFans) {
        this.noOfFans = noOfFans;
    }

    public int getNoOfWings() {
        return this.noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public String getManufracturer() {
        return this.manufracturer;
    }

    public void setManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
    }

    public String getColor() {
        return this.Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getPowerConsuption() {
        return this.powerConsuption;
    }

    public void setPowerConsuption(int powerConsuption) {
        this.powerConsuption = powerConsuption;
    }

    public Dimensions getDimensionOfan() {
        return this.dimensionOfan;
    }

    public void setDimensionOfan(Dimensions dimensionOfan) {
        this.dimensionOfan = dimensionOfan;
    }

    
    public void turnOn(){
    System.out.println("fan is turned on.");
    }

    public void turnOff(){
        System.out.println("fan is turned off");
    }

    public void speedOfFan(int speed){
        if(speed<1){turnOff();}
        else
        turnOn();
        System.out.println("Fan is running at speed "+speed);
    }
    
}
