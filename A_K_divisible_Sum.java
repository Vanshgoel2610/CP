import java.util.*;
 
public class A_K_divisible_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while(t --> 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                if(n == 1) {
                    System.out.println(k);
                } else if(n == k) {
                    System.out.println(1);
                } else if(n < k) {
                    int a = k/n;
                    int b = k%n;
                    if(b != 0) a++;
                    System.out.println(a);
                } else {
                    int x = n/k;
                    int y = n%k;
                    if(y != 0) x++;
                    k *= x;
                    int a = k/n;
                    int b = k%n;
                    if(b != 0) a++;
                    System.out.println(a);
                }
            }
        }
    }
}