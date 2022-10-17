public class Pattern {
    public static void main(String[] args) {
        pattern1(20);
        pattern2(20);
        pattern3(20);
    }
    
    
    public static void pattern1(int n){
        System.out.println("**THIS IS PATTERN1**");
        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print("   *   ");
            }
            System.out.println('\n');
        }
    }
    
    public static void pattern2(int n){
        System.out.println("**THIS IS PATTERN2**\n");
        for(int i=0; i<n; i++){
            for (int j=0; j<=i; j++){
                System.out.print("   *   ");
            }
            System.out.println('\n');
        }
        System.out.println('\n');
    }

    public static void pattern3(int n){
        System.out.println("**THIS IS PATTERN3**\n");
        for(int i=0; i<n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print("   *   ");
            }
            System.out.println('\n');
        }
        System.out.println('\n');
    }

}
