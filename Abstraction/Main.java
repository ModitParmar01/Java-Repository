package Abstraction;

public class Main {
    public static void main(String[] args) {
        Cat wolf = new Cat("Cat", "fuffy", "hehe");
        doAnimalThing(wolf);
    }

    private static void doAnimalThing(Animal animal){
        animal.move(11);
        animal.makeNoise();
    }
}
