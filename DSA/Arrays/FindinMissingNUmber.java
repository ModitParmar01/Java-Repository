package DSA.Arrays;

public class FindinMissingNUmber {

    //FOR N NATURAL NUMBER STARTING FROM 1.
    public  static int findMissingnumber1(int[] arr){
        int n = arr[arr.length-1];
        int sum =0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum!=(n*(n+1))/2){
            return ((n*(n+1))/2)-sum;
        }
        return -1;
    }  

    //FOR N NATURAL NUMBER NOT STARTING FROM 1;
    public static int findMissingnumber2(int[] arr){
        int i=0,a=arr[0];
        int diff = a-0;

        for(;i<arr.length;i++){
            if(arr[i]-i!=diff){
                return i+diff;
            }
        }

        return -1;
    }



public static void main(String[] args) {
    int[] arr ={1,2,3,4,5,7,8,9};
    System.out.println(findMissingnumber1(arr));

    int[] arr2={6,7,8,9,11,12};
    System.out.println(findMissingnumber2(arr2));  //FANTASTIC!
}
}
