/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Flipping_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // kadane'sAlgorithm
        int n = sc.nextInt();
        int count = 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        while(n --> 0) {
            int temp = sc.nextInt();
            if(temp == 0) sum++;
            else {
                sum--;
                count++;
            }
            max = Math.max(sum, max);
            if(sum < 0) sum = 0;
        }
        System.out.println(max+count);
        sc.close();
    }
}