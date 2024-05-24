/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_JoJo_s_Incredible_Adventures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String str = sc.next();
            int n = str.length();

            int max = 0;
            int count = 0;
            for(int i = 0; i < 2*n; i++) {
                if(str.charAt(i%n) == '1') count++;
                else count = 0;
                max = Math.max(max, count);
            }
            int min = Math.min(n, max);
            if(n == min) System.out.println((long)n*n);
            else System.out.println((long)(Math.ceil(max/2d) * Math.ceil((max+1)/2d)));
        }
    }
}