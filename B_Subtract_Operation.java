/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Arrays;
import java.util.Scanner;

public class B_Subtract_Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
            if(n == 1) {
                System.out.println((arr[0] == k)? "YES": "NO");
                continue;
            }
            Arrays.sort(arr);
            int i = 0, j = 1;
            boolean found = false;
            while(i < n && j < n) {
                if(arr[i]+k == arr[j]) {
                    found = true;
                    break;
                } else if(arr[i]+k < arr[j]) i++;
                else j++;
            }
            System.out.println(found? "YES" : "NO");
        }
        sc.close();
    }
}