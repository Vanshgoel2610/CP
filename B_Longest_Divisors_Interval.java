/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Longest_Divisors_Interval {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            long n = sc.nextLong();
            long i = 1;
            while(++i <= n) if(n%i != 0) break;
            System.out.println(i-1);
        }
        sc.close();
    }
}