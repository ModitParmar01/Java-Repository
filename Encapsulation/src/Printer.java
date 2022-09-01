package Encapsulation.src;

public class Printer {
   private int tonnerLevel=100;
   private int noOfPages;
   private boolean duplexPrinter;
   
   public Printer(int tonnerLevel,int noOfPages,boolean duplexPrinter){

    this.tonnerLevel=tonnerLevel;
    this.noOfPages=noOfPages;
    this.duplexPrinter=duplexPrinter;

   }

   public int getTonnerLevel(){
    return this.tonnerLevel;
   }

   public int getNoOfPages(){
    return this.noOfPages;
   }

   public boolean isDuplexPrinter(){
    return this.duplexPrinter;
   }

   public void fillUp(int percentage){
    if(percentage>=0 && percentage<=100){
        this.tonnerLevel=percentage;
    }
    System.out.println("the tonner is filled "+ getTonnerLevel()+'%');
   }

   public void printPages(int number){
    this.noOfPages+=number;
    System.out.println("total number of pages printed are "+ noOfPages);
   }

}
