package DSA.Recursion;
public class StaticRecursion {
    
    static int N=0;
    public static int fun(int x){
        if(x>0){
            N++;
            return fun(x-1)+N;
        }
        return 0;

    }

public static void main(String[] args) {
    int r = fun(5);
    System.out.println(r);
}

}
