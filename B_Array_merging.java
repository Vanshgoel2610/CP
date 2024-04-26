/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Array_merging {
    private static void subArray(int[] arr, int[] subArray) {
        int n = arr.length;
        int i = 0;
        int j = 0;
        while(i < n) {
            int count = 0;
            while(j < n && arr[i] == arr[j]) {
                count++;
                j++;
            }
            subArray[arr[i]] = Math.max(subArray[arr[i]], count);
            i = j;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] maxA = new int[2*(n+1)];
            int[] maxB = new int[2*(n+1)];

            int i = -1;
            while(++i < n) a[i] = sc.nextInt();
            i = -1;
            while(++i < n) b[i] = sc.nextInt();
            subArray(a, maxA);
            subArray(b, maxB);
            int ans = 0;
            i = -1;
            while(++i < maxA.length) ans = Math.max(ans, maxA[i]+maxB[i]);
            System.out.println(ans);
        }
        sc.close();
    }
}