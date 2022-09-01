package Composition.src;

public class AirConditioner {
    private int noOfAirConditioner;
    private String manufraacturer;
    private int powerConsuption;
    private int voltage;
    private int weight;


    public AirConditioner(int noOfAirConditioner, String manufraacturer, int powerConsuption, int voltage, int weight) {
        this.noOfAirConditioner = noOfAirConditioner;
        this.manufraacturer = manufraacturer;
        this.powerConsuption = powerConsuption;
        this.voltage = voltage;
        this.weight = weight;
    }


    public int getNoOfAirConditioner() {
        return this.noOfAirConditioner;
    }

    public void setNoOfAirConditioner(int noOfAirConditioner) {
        this.noOfAirConditioner = noOfAirConditioner;
    }

    public String getManufraacturer() {
        return this.manufraacturer;
    }

    public void setManufraacturer(String manufraacturer) {
        this.manufraacturer = manufraacturer;
    }

    public int getPowerConsuption() {
        return this.powerConsuption;
    }

    public void setPowerConsuption(int powerConsuption) {
        this.powerConsuption = powerConsuption;
    }

    public int getVoltage() {
        return this.voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void turnOn(){
        System.out.println("Equipment is turned on.");
    }

    public void turnOff(){
        System.out.println("Equipment is turned off.");
    }

    public void setTemperature(int temperature){
        turnOn();
        System.out.println("temprature of AC is set to "+temperature);
    }

}
