
import java.util.*;
public class add {
    public static int add(int a,int b){
    

    int sum = a+b;
    return sum;
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = sc.nextInt();
         System.out.println("Enter Second Number");
        int b = sc.nextInt();
        int sum=add(a,b);
        System.out.println("sum is:"+sum);  
    }
}

