
import java.util.Scanner;

public class New {

    public static String getDurationString(int min, int sec){
        if(min>=0 && sec>=0 && sec<=59){

            int hour = min/60;
            int min1 = min%60;
            return hour+"h "+min1+"m "+sec+"s";
        }
        return "invalid value";
    }

    public static String getDurationString(int sec){
        if(sec>=0 ){
            int min = sec/60;
            int sec1 = sec%60;
            return getDurationString(min, sec1);
        }
        return "invalid value";
    }
    public static void main(String[] args) {

        int min, sec;
        Scanner sc = new Scanner(System.in);
        min = sc.nextInt();
        sec = sc.nextInt();
        int sec1 = sc.nextInt();
        sc.close();

       System.out.println(getDurationString(min, sec));
       System.out.println(getDurationString(sec1));
       System.out.println(printYearsAndDays(min));

    }
    public static int printYearsAndDays(long minutes){
        long years,days,rem;
        if(minutes<0){
        System.out.println("Invalid Value");
        return -1;
    }
        years = minutes/525600;
        rem = minutes%525600;
        days = rem/1440;
        
        System.out.println(minutes+" min = "+years+" y and "+days+" d");
        return 0;
    }
}   
