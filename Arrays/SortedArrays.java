package Arrays;
public class SortedArrays {

/*arrays sorted in descending*/
    public static void main(String[] args) {
        int[] arr = {26,2,3,4,5,6,23,24};
        int[] soretedArray = sort(arr);
        printSortedArray(soretedArray);
    }


    public static int[] sort(int[] arr){
        int[] sortedArray = new int[arr.length];
        
        for(int i=0; i<arr.length;i++){
            sortedArray[i]=arr[i];
        }
        
        boolean flag = true;
        int temp;
        
        while(flag){
            flag = false;
            
            for(int i=0; i<arr.length-1; i++){
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i]=sortedArray[i+1];
                    sortedArray[i+1]=temp;
                    flag=true;
                }
            }
        }
        return sortedArray;
    }

    public static void printSortedArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println("value of "+i+" element is "+arr[i]);
        }
    }
}
