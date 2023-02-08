class FibonacciRecursion{

    // private static int fib(int n){
    //     if(n<=1){
    //         return n;
    //     }

    //     return fib(n-1)+fib(n-2);
    // }

    /* THE ABOVE METHODE IS NOT EFFICIENT AS IT IS CALL SAME FUNCTION WITH SAME PARAMETER AGAIN AND AGAIN */

    static int[] F = new int[10];
    public static int fib(int n){
        if(n<=1){
            F[n]=n;
            return n;
        }
        else 
        {
            if(F[n-2]==0)
                F[n-2]=fib(n-2);

            if(F[n-1]==0)
                F[n-1]=fib(n-1);

            return F[n-2]+F[n-1];
        }
    }

    public static void main(String[] args) {
        int fibonacci=fib(10);
        System.out.println(fibonacci);
    }
}