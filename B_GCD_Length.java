import java.util.*;

public class B_GCD_Length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int gcd = (int)Math.pow(10, c-1);
            int x = gcd;
            int y = gcd;
            while(Integer.toString(x).length() < a) x = 2*x;
            while(Integer.toString(y).length() < b) y = 3*y;       // This is a second method and an optimised approach.
            // I have multiplied the numbers by 2 and 3 i.e. prime numbers such that their(2 and 3) gcd is 1.
            System.out.println(x + " " + y);
        }
        sc.close();
    }
}