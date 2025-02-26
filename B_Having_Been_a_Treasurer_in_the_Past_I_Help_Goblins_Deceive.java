/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.*;

public class B_Having_Been_a_Treasurer_in_the_Past_I_Help_Goblins_Deceive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt(); String str = sc.next();
            long low = 0,  hi = 0;
            for(int i = 0; i < n; i++) {
                if(str.charAt(i) == '-') hi++;
                else low++;
            }

            long half1 = hi/2; long half2 = (long)Math.ceil(hi/2f);
            System.out.println(half1*half2*low);
        }
        sc.close();
    }
}