/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Fun_with_Even_Subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; i++) a[i] = sc.nextInt();

            int count = 0;
            int k = 0;
            int i = n-1;
            while(i >= 0) {
                while(i >= 0 && a[i] == a[n-1]) {
                    k++;
                    i--;
                }
                if(i < 0) break;
                count++;
                i -= k;
                k *= 2;
            }
            System.out.println(count);
        }
        sc.close();
    }
}