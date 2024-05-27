/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class A_Little_Nikita {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(m == n) System.out.println("Yes");
            else if(n > m && (n-m)%2 == 0) {
                System.out.println("Yes");
            }
            else System.out.println("No");
        }
    }
}