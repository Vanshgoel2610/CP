/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class C_Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            long len = 0;
            long ans = 0;
            int i = -1;
            while(++i < n) {
                int temp = sc.nextInt();
                if(temp <= q) len++;
                else {
                    if(len >= k) ans += (len-k+1)*(len-k+2)/2;
                    len = 0;
                }
            }
            if(len >= k) ans += (len-k+1)*(len-k+2)/2;
            System.out.println(ans);
        }
        sc.close();
    }
}