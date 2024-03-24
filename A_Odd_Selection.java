/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Odd_Selection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int countOdd = 0;
            int countEven = 0;
            for(int i = 0; i < n; i++)
                if(sc.nextInt()%2 == 1) countOdd++;
                else countEven++;
            boolean yes = false;
            if(countOdd != 0) {
                for(int i = 1; i <= countOdd; i += 2) {
                    if(i > x) break;
                    else if((x-i) <= countEven) {
                        yes = true;
                        break;
                    }
                }
            }
            if(yes) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}