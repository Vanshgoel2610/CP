/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Make_It_Ugly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int count = 1;
            int ans = n;
            int temp = sc.nextInt();
            for(int i = 1; i < n; i++) {
                int next = sc.nextInt();
                if(next == temp) count++;
                else {
                    ans = Math.min(ans, count);
                    count = 0;
                }
            }
            ans = Math.min(ans, count);
            System.out.println((ans^n) == 0? -1: ans);
        }
        sc.close();
    }
}