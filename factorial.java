
       
import java.util.*;
  public class factorial {
      
        public static void main(String[] args) {
            int num;
            double fact=1;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            num= sc.nextInt();
            for(int i=1;i<=num;i++)
            fact=fact*i;
            System.out.println("Factorial number is:"+fact);
        }
      }

