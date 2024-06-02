/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Turtle_and_an_Infinite_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reference:-  https://youtu.be/_s6HwvQf0VE?t=2867
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int left = Math.max(n-m, 0);
            int right = n+m;
            int ans = 0;
            for(int i = 0; i < 32; i++) {
                int temp1 = left/(1<<i);
                int temp2 = right/(1<<i);
                if((temp1&1) == 1) ans |= 1<<i;                // Or I check for temp2 instead.
                else if(temp1 != temp2) ans |= 1<<i;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}