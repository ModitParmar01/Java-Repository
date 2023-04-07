package Composition.BedRoom.src;

public class Bedroom {
    private Bed bed;
    private Table table;
    private Dimensions dimensionsOfBedroom;
    private Cupboard cupboard;
    private Fan fan;
    private AirConditioner airConditioner;
    private Lamp lamp;


    public Bedroom(Bed bed, Table table, Dimensions dimensionsOfBedroom, Cupboard cupboard, Fan fan, AirConditioner airConditioner, Lamp lamp) {
        this.bed = bed;
        this.table = table;
        this.dimensionsOfBedroom = dimensionsOfBedroom;
        this.cupboard = cupboard;
        this.fan = fan;
        this.airConditioner = airConditioner;
        this.lamp=lamp;
    }

    public Lamp getLamp(){
        return this.lamp;
    }

    public Bed getBed() {
        return this.bed;
    }

    public void setBed(Bed bed) {
        this.bed = bed;
    }

    public Table getTable() {
        return this.table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Dimensions getDimensionsOfBedroom() {
        return this.dimensionsOfBedroom;
    }

    public void setDimensionsOfBedroom(Dimensions dimensionsOfBedroom) {
        this.dimensionsOfBedroom = dimensionsOfBedroom;
    }

    public Cupboard getCupboard() {
        return this.cupboard;
    }

    public void setCupboard(Cupboard cupboard) {
        this.cupboard = cupboard;
    }

    public Fan getFan() {
        return this.fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public AirConditioner getAirConditioner() {
        return this.airConditioner;
    }

    public void setAirConditioner(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }


}
