package Polymorphoism.main;
import Polymorphoism.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("car", true, 1, 4, 4);
        Porche porche = new Porche("porche", true, 4, 4, 2);
        Mitsubishi mistu = new Mitsubishi("mistubishi", true, 6, 4, 2);

        car.startEngine();
        porche.startEngine();
        mistu.startEngine();

        car.brake();
        porche.brake();
        mistu.brake();

        car.accelerate();
        porche.accelerate();
        mistu.accelerate();

    }
}
