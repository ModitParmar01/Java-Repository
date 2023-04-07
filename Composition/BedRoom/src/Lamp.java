package Composition.BedRoom.src;
public class Lamp {

    private String brand;
    private int lampIntensity;
    private int colorTemperature;
    private int voltage;
    private int numberOfLamps;


    public Lamp() {
    }

    public Lamp(String brand, int lampIntensity, int colorTemperature, int voltage, int numberOfLamps) {
        this.brand = brand;
        this.lampIntensity = lampIntensity;
        this.colorTemperature = colorTemperature;
        this.voltage = voltage;
        this.numberOfLamps = numberOfLamps;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLampIntensity() {
        return this.lampIntensity;
    }

    public void setLampIntensity(int lampIntensity) {
        this.lampIntensity = lampIntensity;
    }

    public int getColorTemperature() {
        return this.colorTemperature;
    }

    public void setColorTemperature(int colorTemperature) {
        this.colorTemperature = colorTemperature;
    }

    public int getVoltage() {
        return this.voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getNumberOfLamps() {
        return this.numberOfLamps;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void turnOnLamp(){
        System.out.println("Lamp is turned on...");
    }


    public void turnOffLamp(){
        System.out.println("Lamp is turned off...");
    }
    
}
