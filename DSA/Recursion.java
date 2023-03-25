package DSA;
public class Recursion {
    public static void fun(int n){  //funtion will consume T(n) time
        if(n>0){    //that will consume unit time
        System.out.println(n); //unit time.
        fun(n-1);   //T(n-1) time.
        }

                  /*so, T(n)=T(n-1)+2
                    T(n) = 1  when n=0;
                    T(n)= T(n-1)+1 when n>0;    we'll write any constant as 1 here.

                    Moving forward-->
                    T(n)=T(n-2)+1+1 => T(n-2)+2     ...(1)
                    T(n)=T(n-3)+3                   ...(2)

                    similarly,
                    T(n)=T(n-k)+k                   ...(4)

                    assuming: n=k i.e. n-k=0
                    T(n)=T(0)+n
                    T(n)=1+n.
                    hence the recursive function has time complexity of order n.. O(n).
                    the recursive function will run one extra time than no. of printing statement.
                  */

    }
    public static void main(String[] args) {
        int x =3;
        fun(x);
    }
}
