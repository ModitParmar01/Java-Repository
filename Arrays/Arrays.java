package Arrays;
import java.util.*;

public class Arrays {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getInteger(5);
        for(int i=0; i<myIntegers.length; i++){
            System.out.println("Element "+i+", typed value is "+ myIntegers[i]);

        }

    }

    public static int[] getInteger(int number){
        int[] values = new int[number];
        for(int i=0; i<values.length; i++){
            values[i] = sc.nextInt();
        }

        return values;
    }

}
