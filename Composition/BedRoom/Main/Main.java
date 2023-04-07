package Composition.BedRoom.Main;
import Composition.BedRoom.src.*;

public class Main{
    public static void main(String[] args) {

        Bedroom moditSBedroom = 
        new Bedroom(new Bed("FurnitureWala", 8, "Wood", 50, "Double"),
        new Table(4, "FurnitureWala", "Wood", "Black", new Dimensions(12, 20, 35)),
        new Dimensions(60, 80, 150),
        new Cupboard("FurnitureWala", 4, "brown", new Dimensions(50, 30, 45)),
        new Fan(2, 4, "Havells", "White", 240, new Dimensions(12, 20, 20)),
        new AirConditioner(2, "LG", 500, 220, 3),
        new Lamp("Phillips", 30, 4300, 220, 4));
    
        moditSBedroom.getFan().speedOfFan(4);
        moditSBedroom.getAirConditioner().setTemperature(18);
        moditSBedroom.getLamp().turnOnLamp();
        moditSBedroom.getFan().turnOff();
        moditSBedroom.getAirConditioner().turnOff();
        moditSBedroom.getLamp().turnOffLamp();
        System.out.println("GOOD NIGHT");
    }

}
