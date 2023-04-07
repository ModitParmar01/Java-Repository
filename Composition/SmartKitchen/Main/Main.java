package Composition.SmartKitchen.Main;

import Composition.SmartKitchen.src.*;

public class Main {

    public static void main(String[] args) {
        SmartKitchen sc = new SmartKitchen();

        sc.setKitchenState(true, false, true);
        sc.doKitchenWork();
    }
    
}
