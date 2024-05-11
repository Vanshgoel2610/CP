/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Shoe_Shuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 1;
            int prev = sc.nextInt();
            arr[0] = prev;
            boolean flag = false;
            int i = 0;
            while(++i < n) {
                int curr = sc.nextInt();
                if(curr == prev) count++;
                else {
                    if(count == 1) flag = true;
                    count = 1;
                }
                arr[i] = curr;
                prev = curr;
            }
            if(flag || count == 1) {
                System.out.println(-1);
                continue;
            }
 
            int[] ans = new int[n];
            ans[0] = 1;
            i = 0;
            while(++i < n) {
                if(arr[i-1] == arr[i]) {
                    ans[i] = ans[i-1];
                    ans[i-1] = i+1;
                } else ans[i] = i+1;
            }
            i = -1;
            while(++i < n) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}