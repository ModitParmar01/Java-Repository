package Polymorphoism;
public class Porche extends Car {
   public Porche(String name,boolean engine, int cylinders,int wheeels,int doors){
    super(name, engine, cylinders, wheeels, doors);
} 

   @Override
   public void startEngine(){
    System.out.println("porche engine started.");
   }

   @Override
   public void accelerate(){
    System.out.println("porche is accelerating.");
   }
   @Override
   public void brake(){
    System.out.println("brake applied to porche.");
   }

}
