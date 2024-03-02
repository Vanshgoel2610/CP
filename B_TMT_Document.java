/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_TMT_Document {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int mC = 0;
            int tC = 0;
            int i = -1;
            while(++i < n) {
                if(str.charAt(i) == 'T') tC++;
                else mC++;
            }
            if(tC != 2*mC) {
                System.out.println("No");
                continue;
            }
            int count1 = 0;
            int count2 = 0;
            i = -1;
            while(++i < n) {
                if(str.charAt(i) == 'T') count1++;
                else count1--;
                if(str.charAt(n-i-1) == 'T') count2++;
                else count2--;
                if(count1 < 0 || count2 < 0) break;
            }
            if(i < n) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}