/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class D_Odd_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n+1];
            int i = 0;
            while(++i <= n) arr[i] = arr[i-1]+sc.nextInt();
            i = 0;
            while(++i <= q) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();
                int odd = (r-l+1)*k;
                int sum = arr[n]-(arr[r]-arr[l-1])+odd;
                if(sum%2 == 0) System.out.println("NO");
                else System.out.println("YES");
            }
        }
        sc.close();
    }
}