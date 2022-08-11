import java.util.Scanner;

public class Udemy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double pound = sc.nextDouble();
        sc.close();
        double kg = pound*0.45359237;
        System.out.println(kg);
        
    }
}