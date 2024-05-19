/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Arrays;
import java.util.Scanner;

public class B_Maximum_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            long[] suffix = new long[n+1];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            Arrays.sort(arr);

            i = -1;
            while(++i < n) suffix[i+1] = arr[i]+suffix[i];
            long ans = 0;
            i = -1;
            while(++i <= k) ans = Math.max(ans, suffix[n-i]-suffix[2*(k-i)]);
            System.out.println(ans);
        }
    }
}