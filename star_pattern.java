public class star_pattern {
    public static void main(String[] args) {
       int n=4;

        for (int i = 0; i < 4; i++) {          
            for (int j = 0; j <=i; j++) {       
                System.out.print(" * ");          
            }
            System.out.println();                  
        }
        System.out.println("\n\n\n\n\n\nNew Pattern");
           for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
} 
