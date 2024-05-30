/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[1001];
            int i, j;
            for(i = 0; i < n; i++) arr[sc.nextInt()] = i+1;
            int max = -1;
            for(i = 1000; i > 0; i--) {
                if(arr[i] == 0) continue;
                for(j = 1000; j >= 0; j--) {
                    if(arr[j] > 0 && gcd(i, j) == 1) {
                        max = Math.max(max, arr[i]+arr[j]);
                    }
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}