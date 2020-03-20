import java.util.*;

public class Main {
  
    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * factorial(num-1);
        }
    }
    
    public static int ncr(int n, int r) {
        if (r < 2) {
            return n;
        } else {
            return factorial(n) / (factorial(r) * factorial(n-r));
        }
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        
        System.out.println("There are " + ncr(n,r) + " ways.");
    }
}