/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class D_Deletive_Editing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n --> 0) {
            String s = sc.next();
            int i = s.length()-1;
            String t = sc.next();
            int tPosition = t.length()-1;
            while(tPosition >= 0) {
                char temp;
                if(i >= 0) temp = s.charAt(i--);
                else break;
                if(temp == t.charAt(tPosition)) {
                    t = t.substring(0, tPosition);
                    tPosition--;
                }
                else {
                    if(t.contains(temp+"")) break;
                }
            }
            if(!t.isEmpty()) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}