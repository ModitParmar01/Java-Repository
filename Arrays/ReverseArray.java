package Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        reverse(array);
    }
    private static void reverse(int[] array){
        System.out.print("Array = [");
        for(int x=0; x<array.length-1; x++){
            
            System.out.print(array[x]+", ");
            
        }
        System.out.print(array[array.length-1]+"]\n");
        
        
    
        System.out.print("Reversed array = [");
        for(int y=array.length-1; y>=1; y--){
            System.out.print(array[y]+", ");
        }
        System.out.print(array[0]+"]");
    }
}
