import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Number is even: " + num);
        } else {
            System.out.println("Number is odd: " + num);
        }

       
    }
}
