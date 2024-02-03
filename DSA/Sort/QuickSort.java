package DSA.Sort;

public class QuickSort {

    public static void main(String[] args) {
        int[] a = {10,2,4,7,6,3};
        int j = partition(a,0,a.length-1);
        System.out.println(j);
    }

    public static int partition(int[] a, int l, int h){
        int pivot = a[l];
        int i=l;
        int j=h;

        while(i<j){
            do{
                i++;
            }while(a[i]<=pivot);
            do{
                j--;
            }while(a[j]>pivot);
            if(i<j)
                swap(a[i],a[j]);
        }

        swap(a[l], a[j]);
        return j;
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

}
