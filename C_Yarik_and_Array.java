/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class C_Yarik_and_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();

            int i = 0;
            int input = sc.nextInt();
            boolean even = input%2 == 0;
            int sum = input;
            int max = sum;

            // Here I have applied kadane's algorithm with some modifications.
            while(++i < n) {
                input = sc.nextInt();
                boolean temp = input%2 == 0;
                if(temp == even) sum = 0;
                else {
                    even = !even;
                    if(sum < 0) sum = 0;
                }
                sum += input;
                max = Math.max(max, sum);
            }
            System.out.println(max);
        }
    }
}