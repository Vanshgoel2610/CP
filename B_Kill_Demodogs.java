/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Kill_Demodogs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            long n = sc.nextLong();

            /* eg:- if n == 4 then observe pattern: 1^2 + 2^2 + 3^2 + 4^2 + 1*2 + 2*3 + 3*4 = 50 */
            long mod = (long)1e9+7;
            long first = (n*(n+1))%mod;
            long second = 4*n-1;
            long mul = (first*second) % mod;
            long ans = mul*337;
            System.out.println(ans%mod);
        }
        sc.close();
    }
}