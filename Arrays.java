import java.util.Scanner;
public class Arrays {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int[] arr = new int[n];
    
    for(int i=0; i<arr.length; i++){
       arr [i] = sc.nextInt();
    }
    sc.close();
    int temp=0;
    for (int j=0; j<(arr.length)/2; j++){
        temp=arr[j];
        arr[j]=arr[arr.length-(j+1)];
        arr[arr.length-(j+1)]=temp;
    }

    for(int i=0; i<arr.length; i++){
        System.out.println(arr [i]);
     }
}
}