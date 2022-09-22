package Arrays;
public class SortedArrays {

/*arrays sorted in descending*/
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,23,24,26};
        int[] soretedArray = sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.println(soretedArray[i]);
        }
    }


    public static int[] sort(int[] arr){
        int temp=0;
        for(int j=0; j<arr.length-1; j++){
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
    }
        return arr;
    }
}
