package Encapsulation.main;
import Encapsulation.src.Printer;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(20, 30, true);

        printer.fillUp(150);
        printer.getTonnerLevel();
        printer.printPages(40);

    }    
}
