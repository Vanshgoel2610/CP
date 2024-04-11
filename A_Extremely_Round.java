/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Extremely_Round {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            if(n <= 9) System.out.println(n);
            else {
                int count = 0;
                while(n > 10) {
                     n /= 10;
                     count += 9;
                }
                count += n;
                System.out.println(count);
            }
        }
        sc.close();
    }
}