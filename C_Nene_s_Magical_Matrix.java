/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class C_Nene_s_Magical_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long sum = 0;
            for(int i = 1; i <= n; i++) sum += i*(2L*i-1);
            int twiceN = 2*n;
            System.out.println(sum + " " + twiceN);
            for(int i = n; i >= 1; i--) {
                System.out.print(1 + " " + i + " ");
                for(int j = 1; j <= n; j++) System.out.print(j + " ");
                System.out.println();
                System.out.print(2 + " " + i + " ");
                for(int j = 1; j <= n; j++) System.out.print(j + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}