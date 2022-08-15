import java.util.Scanner;

public class Udemy{
   public static int conversion(double feet, double inches){
    if(feet>=0 && inches<=12 && inches>=0){
        double centimeterf = 30.48*feet;
        double centimeteri = 2.54*inches;
        System.out.println(feet+" Feet in centimeter is "+centimeterf);
        System.out.println(inches+" Inches in centimeter is "+ centimeteri);
        return 0;
    }
    return -1;
   }
    
   public static int conversion(double inches){
    if(inches>=0){
        double centimeter = 2.54*inches;
        System.out.println(inches+" inches in centimeter is "+centimeter);
        return 0;
    }
    return -1;
   }

    public static void main(String[] args){
        double inches,feet;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter inches : ");
        inches = sc.nextDouble();
        System.out.println("Enter feet : ");
        feet = sc.nextDouble();
        sc.close();

        System.out.println(conversion(feet, inches));
        System.out.println(conversion(inches));
    }
}