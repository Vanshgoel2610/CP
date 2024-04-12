/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Two_Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(n == 1) {
                if(a == 1 && b == 1) System.out.println("YES");
                else System.out.println("NO");
            } else {
                if((a+b <= n && (b+a+1 < n)) || a/2+b/2 == n || (a == n && b == n)) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}