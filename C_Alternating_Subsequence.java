/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class C_Alternating_Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int nMin = Integer.MIN_VALUE;
            int pMax = 0;
            long sum = 0;
            int n = sc.nextInt();
            int current = sc.nextInt();
            if(current < 0) nMin = current;
            else pMax = current;
            while(n --> 1) {
                int next = sc.nextInt();
                if(next < 0) {
                    sum += pMax;
                    pMax = 0;
                    nMin = Math.max(nMin, next);
                } else {
                    pMax = Math.max(pMax, next);
                    if(nMin > Integer.MIN_VALUE) sum += nMin;
                    nMin = Integer.MIN_VALUE;
                }
            }
            sum += pMax;
            if(nMin > Integer.MIN_VALUE) sum += nMin;
            System.out.println(sum);
        }
        sc.close();
    }
}