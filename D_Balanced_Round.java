/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Arrays;
import java.util.Scanner;
 
public class D_Balanced_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int max = 0;
            int count = 1;
            int prev = arr[0];
            i = 0;
            while(++i < n) {
                int curr = arr[i];
                if(curr-prev <= k) count++;
                else {
                    max = Math.max(max, count);
                    count = 1;
                }
                prev = curr;
            }
            max = Math.max(max, count);
            System.out.println(n-max);
        }
        sc.close();
    }
}