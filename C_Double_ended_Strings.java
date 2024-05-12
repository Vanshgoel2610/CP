/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class C_Double_ended_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String a = sc.next();
            String b = sc.next();
            int n = a.length();
            int m = b.length();
            int max = 0;
            for (int len = 1; len <= Math.min(n, m); len++) {
                for (int i = 0; i + len <= n; i++) {
                    for (int j = 0; j + len <= m; j++) {
                        if (a.substring(i, i+len).equals(b.substring(j, j+len))) max = Math.max(max, len);
                    }
                }
            }
            System.out.println(a.length()+b.length()-2*max);
        }
    }
}