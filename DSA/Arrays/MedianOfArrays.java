package DSA.Arrays;

public class MedianOfArrays{

    public static double arrayMedian(int[] arr1, int[] arr2){
        
        int m = arr1.length, n = arr2.length;
        int[] newarr= new int[m+n];
        int i=0,j=0,k=0;

        while(i<m&&j<n){
            if(arr1[i]<arr2[j]){
                newarr[k++]=arr1[i++];
            }
            else
            newarr[k++]=arr2[j++];
        }

        while(i<m){
            newarr[k++]=arr1[i++];
        }

        while(j<n){
            newarr[k++]=arr2[j++];
        }

        int mid = (m+n)/2;
        if((m+n)%2==0){
            return (double)(newarr[mid-1]+newarr[mid])/2.0;
        }
        else
            return (double)(newarr[mid]);

    }

    public static void main(String[] args) {
        int[] arr1={1,2,5,11,12};
        int[] arr2={7,8,9,10};

        double median = arrayMedian(arr1, arr2);
        System.out.println(median);
    }

}