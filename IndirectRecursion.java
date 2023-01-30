public class IndirectRecursion {
    public static void funA(int n){
        if(n>0){
            System.out.println(n);
            funB(n-1);
        }
    }

    public static void funB(int n){
        if (n>0){
            System.out.println(n);
            funC(n-1);
        }
    }

    public static void funC(int n){
        if (n>1){
            System.out.println(n);
            funA(n/2);
        }
    }


    public static void main(String[] args) {
        funA(30);
    }
}
