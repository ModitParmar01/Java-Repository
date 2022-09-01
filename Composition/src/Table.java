package Composition.src;

public class Table {
    private int legs;
    private String manufracturer;
    private String material;
    private String color;
    private Dimensions dimensionOfTable;



    public Table(int legs, String manufracturer, String material, String color,Dimensions dimensionOfTable) {
        this.legs = legs;
        this.manufracturer = manufracturer;
        this.material = material;
        this.color = color;
        this.dimensionOfTable=dimensionOfTable;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getManufracturer() {
        return this.manufracturer;
    }

    public void setManufracturer(String manufracturer) {
        this.manufracturer = manufracturer;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dimensions getDimensionOfTable(){
        return dimensionOfTable;
    }

}
