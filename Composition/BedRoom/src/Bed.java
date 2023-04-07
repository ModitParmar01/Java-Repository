package Composition.BedRoom.src;

public class Bed {
    private String brand;
    private int legs;
    private String material;
    private int size;
    private String type;


    public Bed(String brand, int legs, String material, int size, String type) {
        this.brand = brand;
        this.legs = legs;
        this.material = material;
        this.size = size;
        this.type = type;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getLegs() {
        return this.legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getMaterial() {
        return this.material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
