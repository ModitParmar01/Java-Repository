public class TreeRecursion {
    public static void fun(int n){
        if (n>0){
            System.out.println(n);
            fun(n-1);
            fun(n-1);
        }
    } //total number of function calls in tree recursion is in G.P. >> 2^(n+1)-1.
      //here total number of calls is 65. (n=5)

    public static void main(String[] args) {
        fun(5);
    }

}
