/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Arrays;
import java.util.Scanner;
 
public class G_2_Subsequence_Addition_Hard_Version {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            Arrays.sort(arr);
 
            if(arr[0] != 1) {
                System.out.println("NO");
                continue;
            }
            long sum = arr[0];
            i = 0;
            while(++i < n) {
                if(sum >= arr[i]) {
                    sum += arr[i];
                } else break;
            }
            if(i == n) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}