package Abstraction;

public class Cat extends Animal{
    public Cat(String type, String name, String breed) {
        super(type, name, breed);
    }

    @Override
    public void move(int speed) {
        System.out.println("moving at "+speed);

    }

    @Override
    public void makeNoise() {
        if(type=="Wolf")
            System.out.println("Howling!");
        else
            System.out.println("woof!");
    }
}
