/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_GCD_Problem {
    private static int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int a = 3, gcd = 1, b = n-a-gcd;
            while(a+b+gcd != n || gcd(a, b) != gcd) {
                a++; b--;
            }
            System.out.println(a + " " + b + " " + gcd);
        }
        sc.close();
    }
}