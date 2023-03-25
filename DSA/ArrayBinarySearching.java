package DSA;

public class ArrayBinarySearching {
    public static int binsearch(int l, int h, int key, int[] arr){

        while(l<=h){
            int mid=(l+h)/2;

            if(key==arr[mid]) return mid;

            else if(key<arr[mid]){
                h = mid-1;
            }

            else l=mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(binsearch(0, 8, 8, arr));
    }
}
