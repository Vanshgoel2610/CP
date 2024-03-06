/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class C_K_th_Not_Divisible_by_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int remaining = n-1;
            int temp = k/remaining;
            if(k%remaining == 0) temp--;
            int curr = temp*n;
            int remCurr = curr-temp;
            System.out.println(k-remCurr+curr);
        }
        sc.close();
    }
}