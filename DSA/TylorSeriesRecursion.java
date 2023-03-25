package DSA;
public class TylorSeriesRecursion {
    static double p=1.00,f=1.00;
    public  static double e(int x, int n){
        
        if(n==0){
            return 1;
        }
        else{
            double r = e(x,n-1);
            p=p*x;
            f = f*n;
            return r+p/f;
        }
    } 
    
        public static void main(String[] args) {
            double r = e(2,10);
            System.out.println(r);
        }
    
    }
    

