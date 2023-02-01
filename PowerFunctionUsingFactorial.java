import java.util.Scanner;
public class PowerFunctionUsingFactorial {
    
    // public static int pow(int m,int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     else
    //     return pow(m, n-1)*m;
    // 

    /* **MODIFIED VERSION** */
    public static int pow(int m, int n){
        if (n==0){
            return 1;
        }
        else if(n%2==0){
            return pow(m*m, n/2);
        }
        else
        return m*pow(m*m, (n-1)/2);
    }                               //more efficient consume half space.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int m = sc.nextInt();

        System.out.print("Enter its power: ");
        int n = sc.nextInt();
        sc.close();

        
        int result = pow(m, n);
        System.out.println(result);
    }
    

}
