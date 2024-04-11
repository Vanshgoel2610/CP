/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            // It's more like a bubble sort
            int n = sc.nextInt();
            int k = sc.nextInt();
            boolean sorted = true;
            int temp = sc.nextInt();
            int i = 0;
            while(++i < n) {
                int curr = sc.nextInt();
                if(curr < temp) sorted = false;
                temp = curr;
            }
            if(sorted) System.out.println("YES");
            else {
                if(k > 1) System.out.println("YES");
                else System.out.println("NO");
            }
        }
        sc.close();
    }
}