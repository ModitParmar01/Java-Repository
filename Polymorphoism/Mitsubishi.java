package Polymorphoism;

public class Mitsubishi extends Car{

    public Mitsubishi(String name, boolean engine,int cylinders,int wheeels,int doors){
        super(name,engine,cylinders,wheeels,doors);
    }

    @Override
    public void startEngine(){
        System.out.println("mitsubishi engine started");
    }
    
    @Override
    public void accelerate(){
        System.out.println("mitsubishi accelerating");
    }

    @Override
    public void brake(){
        System.out.println("mitsubishi brakes applied");
    }
    
}
