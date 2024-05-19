/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Arrays;
import java.util.Scanner;

public class A_Counting_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int i = -1;
            while(++i < n) a[i] = sc.nextInt();
            i = -1;
            while(++i < n) b[i] = sc.nextInt();
            Arrays.sort(a);
            Arrays.sort(b);
            int[] count = new int[n];
            int j = 0;
            i = -1;
            while(++i < n) {
                while(j < n && a[j] <= b[i]) j++;
                if(j != n) count[i] = n-j;
            }
            Arrays.sort(count);
            long ans = 1;
            int mod = 1000000007;
            i = -1;
            while(++i < n) {
                ans = ((ans%mod)*((count[i]-i)%mod))%mod;
            }
            System.out.println(ans);
        }
    }
}