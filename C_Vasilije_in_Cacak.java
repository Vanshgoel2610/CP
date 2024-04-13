/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class C_Vasillija_in_Cacak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            long n = sc.nextInt();
            long k = sc.nextInt();
            long x = sc.nextLong();
            long totalSum = (n*(n+1))/2;
            long minSum = (k*(k+1))/2;
            long maxSum = totalSum-((n-k)*(n-k+1))/2;
            if(x >= minSum && x <= maxSum) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}