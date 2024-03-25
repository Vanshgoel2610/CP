/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Pashmak_and_Garden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int diff1 = Math.abs(x2-x1);
        int diff2 = Math.abs(y2-y1);
        if(x1 != x2 && y1 != y2 && Math.abs(diff1) != Math.abs(diff2)) System.out.println(-1);
        else if(x1 == x2) {
            int temp1 = x1+Math.abs(y1-y2);
            int temp2 = x2+Math.abs(y1-y2);
            System.out.print(temp1 + " " + y1 + " " + temp2 + " " + y2);
        } else if(y1 == y2) {
            int diff = Math.abs(x1-x2);
            int temp1 = y1+diff;
            int temp2 = y2+diff;
            System.out.print(x1 + " " + temp1 + " " + x2 + " " + temp2);
        } else {
            System.out.print(x1 + " " + y2 + " " + x2 + " " + y1);
        }
        System.out.println();
        sc.close();
    }
}