/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Fireworks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();
            System.out.println(m/a+1+m/b+1);
        }
        sc.close();
    }
}