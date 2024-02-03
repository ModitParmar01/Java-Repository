package Abstraction;

public abstract class Animal {
    protected String type;
    private String name;
    private String breed;

    public Animal(String type, String name, String breed){
        this.type=type;
        this.name=name;
        this.breed=breed;
    }

    public abstract void move(int speed);

    public abstract void makeNoise();
}
