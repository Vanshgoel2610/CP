/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class D_Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] prefix = new int[n+1];
            prefix[0] = 0;
            int i = -1;
            while(++i < n) {
                prefix[i+1] = prefix[i];
                if(str.charAt(i) == 'B') prefix[i+1]++;
            }
            int max = 0;
            i = 0;
            while(++i+k-1 <= n) max = Math.max(max, prefix[i+k-1]-prefix[i-1]);
            System.out.println(k-max);
        }
    }
}