package Arrays;
import java.util.Scanner;

public class FindMinimym{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements in array: ");
        int count = sc.nextInt();
        int[] myArray = readInteger(count);
        findMinimum(myArray);

    }

    public static int[] readInteger(int count){
    int[] array = new int[count];

    for(int i=0; i<array.length; i++){
        System.out.print("enter element no "+i+": ");
        array[i] = sc.nextInt();
    }

    return array;
}

public static void findMinimum(int[] xyz){
    int minimum=xyz[0];
    
    for(int i=0; i<xyz.length-1;i++){
        if(xyz[i]>=xyz[i+1]){
            minimum = xyz[i+1];
        }
    }

    System.out.println("minimmum value in array is "+ minimum);
}


}