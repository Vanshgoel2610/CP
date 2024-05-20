/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Lunatic_Never_Content {
    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int i = -1;
            while(++i < n) a[i] = sc.nextInt();

            i = 0;
            int gcd = Math.abs(a[i]-a[n-i-1]);
            while(++i < n/2) {    // T.C:-  O(n*log(1e9))
                int diff = Math.abs(a[i]-a[n-i-1]);
                if(diff == 0 || gcd == 0) gcd = Math.max(gcd, diff);
                else gcd = gcd(gcd, diff);
            }
            System.out.println(gcd);
        }
    }
}