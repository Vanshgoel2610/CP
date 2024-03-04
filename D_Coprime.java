/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class D_Coprime {
    public static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[1001];
            int i = 0;
            while(++i <= n) arr[sc.nextInt()] = i;
            int ans = -1;
            i = 0;
            while(++i <= 1000) {
                if(arr[i] == 0) continue;
                int j = 0;
                while(++j <= 1000)
                    if(arr[j] > 0 && gcd(Math.max(i, j), Math.min(i, j)) == 1) ans = Math.max(ans, arr[i]+arr[j]);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}