/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Kalindrome_Array {
    static boolean flag;
    static void check(int x, int[] a, int n) {
        int[] b = new int[n];
        int m = -1;
        for(int i = 0; i < n; i++) {
            if(a[i] != x) b[++m] = a[i];
        }
        for(int i = 0; i <= m/2; i++) {
            if(b[i] != b[m-i]) return;
        }
        flag = true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            flag = true;

            for(int i = 0; i < n/2; i++) {
                if(a[i] != a[n-i-1]) {
                    flag = false;
                    check(a[i], a, n);
                    check(a[n-i-1], a, n);
                    break;
                }
            }
            System.out.println((flag)? "YES": "NO");
        }
        sc.close();
    }
}