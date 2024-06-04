/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_AND_Sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int X = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++) {
                int temp = sc.nextInt();
                if(temp != i) X &= temp;
            }
            System.out.println(X);
        }
        sc.close();
    }
}