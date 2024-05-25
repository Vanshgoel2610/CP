/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_GCD_Partition {
    static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long[] prefix = new long[n];
            int i = 0;
            prefix[i] = sc.nextInt();
            while(++i < n) prefix[i] = prefix[i-1]+sc.nextInt();

            // Taking k as 2.
            long max_gcd = 1;
            i = -1;
            while(++i < n-1) {
                max_gcd = Math.max(max_gcd, gcd(prefix[i], prefix[n-1]-prefix[i]));
            }
            System.out.println(max_gcd);
        }
    }
}