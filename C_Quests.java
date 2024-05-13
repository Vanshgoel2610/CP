/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class C_Quests {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] sum_a = new int[n];
            int[] max_b = new int[n];
            sum_a[0] = sc.nextInt();
            int i = 0;
            while (++i < n) sum_a[i] = sum_a[i-1]+sc.nextInt();
            max_b[0] = sc.nextInt();
            i = 0;
            while(++i < n) max_b[i] = Math.max(max_b[i-1], sc.nextInt());

            int max = 0;
            k--;
            i = -1;
            while(++i < n) {
                max = Math.max(max, sum_a[i]+max_b[i]*(k-i));
                if(i == k) break;
            }
            System.out.println(max);
        }
    }
}