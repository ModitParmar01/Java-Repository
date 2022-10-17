package RefrenceTypeValuedType.src.main;

import java.util.Arrays;
import RefrenceTypeValuedType.src.methodArray;

public class RefrenceVsValued extends methodArray {
    public static void main(String[] args) {
        //value type example.
        int myInt = 69;
        int anotherInt = myInt;

        System.out.println("value of myInt = "+ myInt +"\nvalue of another int = "+anotherInt);

        anotherInt++;
        System.out.println("after value of myInt = "+ myInt +"\nafter value of another int = "+anotherInt);

        //refrence type example
        int[] myArray = new int[5];
        int[] anotherArray = myArray;

        System.out.println("\nvalue of myArray = "+ Arrays.toString(myArray));
        System.out.println("value of anotherArray = "+ Arrays.toString(anotherArray));

        modifyArray(anotherArray);

        System.out.println("after value of myArray = "+ Arrays.toString(myArray));
        System.out.println("after value of anotherArray = "+ Arrays.toString(anotherArray));
        //we can see change in both objects.
        //whenever we use new keyword for the object that object will point to a new refrence memory address.

    }
}
