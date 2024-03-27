/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class A_Setting_up_Camp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int count = a;
            count += b/3;            // The total number of extroverts that makes group with extroverts only.
            b = b%3;
            if(c >= (3-b) && b > 0) {
                count++;
                c -= 3-b;
            } else if(c < (3-b) && b > 0) {
                System.out.println(-1);
                continue;
            }
            count += c/3;
            c = c%3;
            if(c > 0) count++;
            System.out.println(count);
        }
        sc.close();
    }
}