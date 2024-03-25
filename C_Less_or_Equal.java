/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Arrays;
import java.util.Scanner;

public class C_Less_or_Equal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] arr = new long[n];
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Arrays.sort(arr);
        if(k == 0) {
            if(arr[0] > 1) System.out.println(1);
            else System.out.println(-1);
            return;
        }
        long ans = arr[k-1];
        if(k < n && arr[k-1] == arr[k]) System.out.println(-1);
        else System.out.println(ans);
        sc.close();
    }
}