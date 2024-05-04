/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Beautiful_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long k = sc.nextInt();
            int b = sc.nextInt();
            long s = sc.nextLong();
            long[] arr = new long[n];
            long sum;

            arr[n-1] = k*b;
            sum = arr[n-1];
            if(s-sum >= 0) {
                arr[n-1] += Math.min(s-sum, k-1);
                sum += Math.min(s-sum, k-1);
            }
            if(sum > s) {
                System.out.println(-1);
                continue;
            }

            int i = -1;
            while(++i < n-1) {
                if(s-sum == 0) break;
                else if(s-sum > 0) {
                    arr[i] = Math.min(s-sum, k-1);
                    sum += arr[i];
                }
            }
            if(sum != s) {
                System.out.println(-1);
                continue;
            }
            i = -1;
            while(++i < n) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}