import java.util.*;

public class Main {

    public static int gcd(int n, int d) {
        int n_gcd = 1;
        
        for (int i=1; i<=n && i<=d; i++) {
            if (n % i == 0 && d % i == 0) 
                n_gcd = i;
        }
        
        return n_gcd;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        
        System.out.println("lowest terms is: " + (n/gcd(n,d) + "/" + (d/gcd(n,d))));
    }
}