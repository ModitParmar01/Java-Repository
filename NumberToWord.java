public class NumberToWord {

    public static void main(String[] args) {
        numberToWord(100);
    }

    
        public static void numberToWord(int number){
            
            int rev=0,temp,count=0;
            
            if(number<0){
                System.out.println("Invalid Value");
            }
            
            
            else
            rev = reverse(number);
            count = getDigitCount(number);
            
            for(int i=1; i<=count; i++){
                temp=rev%10;
                switch(temp){
                    case 0:
                        System.out.print("Zero ");
                        break;
                        
                    case 1:
                        System.out.print("One ");
                        break;
                        
                    case 2:
                        System.out.print("Two ");
                        break;
                        
                    case 3:
                        System.out.print("Three ");
                        break;
                        
                    case 4:
                        System.out.print("Four ");
                        break;
                        
                    case 5:
                        System.out.print("Five ");
                        break;
                        
                    case 6:
                        System.out.print("Six ");
                        break;
                        
                    case 7:
                        System.out.print("Seven ");
                        break;
                        
                    case 8:
                        System.out.print("Eight ");
                        break;
                   
                    case 9:
                        System.out.print("Nine ");
                        break;
                }
                
                rev /= 10;
            }
            
        }
        
        
        public static int reverse(int number){
            
            int temp,rev=0;
            
            while(number!=0){
                temp=number%10;
                rev=rev*10+temp;
                number /=10;
            }
            return rev;
        }
        
        
        
        public static int getDigitCount(int number){
            
            int count=0;
            
            if(number<0){
                return -1;
            }
            
            else if (number==0){
                return 1;
            }
            
            else
            while(number!=0){
                number/=10;
                count++;
            }
            return count;
        }
        
        
    }    

