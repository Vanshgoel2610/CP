/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Permutation_Swap {
    private static int GCD(int a, int b) {
        if(b == 0) return a;
        return GCD(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int gcd = 0;
            int i = 0;
            while(++i <= n) gcd = GCD(Math.abs(sc.nextInt()-i), gcd);
            System.out.println(gcd);
        }
        sc.close();
    }
}
