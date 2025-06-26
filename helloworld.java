public class helloworld {
    
    

    public int add() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        return sum;
    }

public  helloworld() {
        System.out.println("This is default constructor");
    }
    public static void main(String[] args) {
        helloworld h1 = new helloworld();
        int sum = h1.add();
        System.out.println(sum);   
    }
}
