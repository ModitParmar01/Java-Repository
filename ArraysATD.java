import java.util.Scanner;

public class ArraysATD {

    public static int[] deleteElement(int index,int[] arr){
        if (arr == null || index<0 || index>=arr.length){
            return arr;
        }
        int[] newarr= new int[arr.length-1];
        
        for(int i=0, k=0;i<arr.length;i++){
            if(i==index)
            continue;

            newarr[k++]=arr[i];
        }

        return newarr;
    }

    public static void insert(int[] arr, int index, int x){
        int i;
        if(index>=0 && index<arr.length){
            for(i=(arr.length-1); i>index; i--)
            arr[i]=arr[i-1];
        
            arr[index]=x;
        }
    }//correction required.

    public static int[] addX(int n, int[] arr, int x){
        int[] newarr= new int[n+1]; 

        for (int i=0; i<n;i++)
        newarr[i]=arr[i];

        newarr[n]=x;
        return newarr;
    }

    public static void display(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("The "+i+"th element of array is "+arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n=sc.nextInt();

        int[] arr= new int[n];

        for(int i=0; i<arr.length; i++){
            System.out.print("Enter "+i+"th element: ");
            arr[i]=sc.nextInt();
        }
        sc.close();
        // insert(arr, 2, 10);//dikkat hai

        display(addX(n, arr, 9));
        display(deleteElement(1, arr));
        
    }
}
