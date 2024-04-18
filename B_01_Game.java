/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    public static void B_01_Game(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String str = sc.next();
            int n = str.length();
            int one = 0;
            int zero = 0;
            int i = -1;
            while(++i < n) {
                if(str.charAt(i) == 48) zero++;
                else one++;
            }
            if(Math.min(one, zero)%2 == 0) System.out.println("NET");
            else System.out.println("DA");
        }
        sc.close();
    }
}