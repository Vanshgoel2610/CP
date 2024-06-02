/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class A_Turtle_and_Piggy_Are_Playing_a_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            r >>= 1;
            int count = 0;
            while(r > 0) {
                count++;
                r >>=1 ;
            }
            System.out.println(count);
        }
        sc.close();
    }
}