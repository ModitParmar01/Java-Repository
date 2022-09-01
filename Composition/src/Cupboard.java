package Composition.src;
public class Cupboard{
    private String manufracturer;
    private int noOfDoors;
    private String color;

    public Cupboard(String manufracturer, int noOfDoors, String color, Dimensions dimensionsOfCupboard) {
        this.manufracturer = manufracturer;
        this.noOfDoors = noOfDoors;
        this.color = color;
        this.dimensionsOfCupboard = dimensionsOfCupboard;
    }
    private Dimensions dimensionsOfCupboard;


    public String getManufracturer() {
        return this.manufracturer;
    }

    public void setManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
    }

    public int getNoOfDoors() {
        return this.noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dimensions getDimensionsOfCupboard() {
        return this.dimensionsOfCupboard;
    }

    public void setDimensionsOfCupboard(Dimensions dimensionsOfCupboard) {
        this.dimensionsOfCupboard = dimensionsOfCupboard;
    }

    public void isOpen(){
        System.out.println("cupboad is open.");
    }

    public void isClose(){
        System.out.println("Cupboard is");
    }

}