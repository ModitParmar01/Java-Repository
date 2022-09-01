import java.util.Scanner;
 
public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }


    public static void inputThenPrintSumAndAverage(){
        int a,sum=0,count=0;
        double avg=0.0;
        
        Scanner sc = new Scanner(System.in);
        
        while(count<1000){
            boolean hasNextInt = sc.hasNextInt();
            if(hasNextInt){
            a = sc.nextInt();
            sum+=a;
            count++;
            }
            else{
                System.out.println("Invalid");
                break;
            }
        }
        sc.close();
        
        avg = Math.round(sum/avg);
        
        System.out.println("Sum = "+sum+" AVG = "+avg);
    }
}