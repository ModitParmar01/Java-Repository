public class NaturalNumbersRecursion {
    
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else
        return sum(n-1)+n;
    } 


    public static void main(String[] args) {
        int result = sum(6);
        System.out.println(result);
    }


}
