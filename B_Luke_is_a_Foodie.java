/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Luke_is_a_Foodie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int l = 0;
            int r = Integer.MAX_VALUE;
            int count = 0;
            int prev = sc.nextInt(), curr;
            l = Math.max(l, prev-x);
            r = Math.min(r, prev+x);
            int i = 0;
            while(++i < n) {
                if(l > r) {
                    count++;
                    l = prev-x;
                    r = prev+x;
                }
                curr = sc.nextInt();
                l = Math.max(l, curr-x);
                r = Math.min(r, curr+x);
                prev = curr;
            }
            if(l > r) count++;
            System.out.println(count);
        }
        sc.close();
    }
}