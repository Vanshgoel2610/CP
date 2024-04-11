/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int max = Integer.MIN_VALUE;
            int temp = 0;
            int i = -1;
            while(++i < n) {
                int curr = sc.nextInt();
                if(i == n-1) {
                    max = Math.max(max, curr-temp);
                    if(2*(x-curr) > max) {
                        max = Math.max(max, 2*(x-curr));
                    }
                } else max = Math.max(max, curr-temp);
                temp = curr;
            }
            System.out.println(max);
        }
        sc.close();
    }
}