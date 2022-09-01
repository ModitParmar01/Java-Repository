public class forLoop {
    public static void main(String[] args) {
        int i,count=1,sum=0;
        for (i=0;i<=1000;i++){
            
            if(i%3==0&&i%5==0){
                System.out.println(i+" meet condition.");
                sum += i;
                count++;
            }
           
            if(count==5){
                break;
            }
        
        }
       
        System.out.println(sum+" is the sum");
    }
}
