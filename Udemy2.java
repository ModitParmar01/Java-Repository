import java.util.Scanner;

public class Udemy2 {
   
   public static void main(String[] args) {

        int x;

        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        sc.close();

        System.out.println(sumDigits(x));

   }
   
    public static int sumDigits(int x){
        
        int temp,sum=0;

        if (x>=10){
            while(x!=0){

                x = x%10;
                temp = x;

                temp = x%10;
                sum += temp;
                x = x/10;
            }
            return sum;
        }

        else
        return -1;
    }
}
