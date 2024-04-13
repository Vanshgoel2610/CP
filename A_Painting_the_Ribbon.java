/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class A_Painting_the_Ribbon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            int sameColor = n/m;
            int mod = n%m;
            if(mod > 0) sameColor++;
            int diffColor = n-sameColor;
            if(k >= diffColor) System.out.println("NO");
            else System.out.println("YES");
        }
        sc.close();
    }
}