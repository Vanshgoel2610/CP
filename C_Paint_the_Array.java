/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class C_Paint_the_Array {
    static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextLong();

            long gcd1 = 0, gcd2 = 0;
            for(int i = 0; i < n; i += 2) gcd1 = gcd(a[i], gcd1);
            for(int i = 1; i < n; i += 2) gcd2 = gcd(a[i], gcd2);
            boolean flag = false;
            for(int i = 0; i < n; i += 2) {
                if(a[i]%gcd2 == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(gcd2);
                continue;
            }
            flag = false;
            for(int i = 1; i < n; i += 2) {
                if(a[i]%gcd1 == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println(gcd1);
            else System.out.println(0);
        }
        sc.close();
    }
}