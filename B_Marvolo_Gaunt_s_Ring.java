/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.*;

public class B_Marvolo_Gaunt_s_Ring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        https://codeforces.com/problemset/problem/855/B
        int n = sc.nextInt(); long ans = Long.MIN_VALUE;
        long[] t = new long[3]; long[] arr = new long[n];
        long[] p = new long[n]; long[] s = new long[n];
        for(int i = 0; i < 3; i++) t[i] = sc.nextInt();
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();

        p[0] = t[0]*arr[0]; s[n-1] = t[2]*arr[n-1];
        for(int i = 1; i < n; i++) p[i] = Math.max(p[i-1], t[0]*arr[i]);
        for(int i = n-2; i >= 0; i--) s[i] = Math.max(s[i+1], t[2]*arr[i]);
        for(int i = 0; i < n; i++) {
            long temp = p[i] + arr[i]*t[1] + s[i];
            ans = Math.max(ans, temp);
        }

        System.out.println(ans);
        sc.close();
    }
}