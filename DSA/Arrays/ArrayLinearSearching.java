package DSA.Arrays;
public class ArrayLinearSearching {
    public static int search(int key, int[] arr){

        for(int i=0; i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }

        return-1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(search(7, arr));
    }
}
