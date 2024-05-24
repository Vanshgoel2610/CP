/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Arrays;
import java.util.Scanner;

public class G_1_Teleporters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int[] arr = new int[n+1];
            int i = 0;
            while(++i <= n) arr[i] = sc.nextInt()+i;

            Arrays.sort(arr);
            int count = 0;
            i = 0;
            while(++i <= n) {
                if(arr[i] <= c) {
                    c -= arr[i];
                    count++;
                }
                else break;
            }
            System.out.println(count);
        }
    }
}