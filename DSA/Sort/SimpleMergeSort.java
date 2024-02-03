package DSA.Sort;

import java.util.Arrays;

public class SimpleMergeSort {
    public static void main(String[] args) {
        int[] a = {2,4,6,7};
        int[] b = {1,3,5,8,9};

        int[] c = mergeSort(a,b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] mergeSort(int[] a, int[] b){
        int i = 0;
        int j = 0;
        int k =0;
        int[] c = new int[a.length+b.length];

        while(i<a.length && j<b.length){
            if(a[i]<b[j])
                c[k++] = a[i++];
            else
                c[k++] = b[j++];
        }

        for(;i<a.length;i++){
            c[k++] = a[i];
        }
        for(;j<b.length;j++){
            c[k++] = b[j];
        }

        return c;
    }
}