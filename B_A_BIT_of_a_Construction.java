/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_A_BIT_of_a_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(n == 1) {
                System.out.println(k);
                continue;
            }

            /* Let's take an example of n = 2 and k = 57(1 1 1 0 0 1). Now find the msb of 57 let's say x then 2^x <= k < 2^(x+1).
            *  Now take the first num 2^x-1 as it will take most of the set bits (0 1 1 1 1 1) and the second num is k-num1*/

            int num1;
            int num2;
            int msb = 0;
            for(int i = 0; i < 30; i++) {
                if((k&(1<<i)) >= 1) msb = i;
            }
            num1 = (int)Math.pow(2, msb)-1;
            num2 = k-num1;
            System.out.print(num1 + " " + num2);
            for(int i = 3; i <= n; i++) System.out.print(" 0");
            System.out.println();
        }
        sc.close();
    }
}