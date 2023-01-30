public class NestedRecursion {
    public static int fun(int n){
        if(n>10){
            return n-10;
        }
        else
        return fun(fun(n+11));
    }

    public static void main(String[] args) {
        fun(0);
    }

}
