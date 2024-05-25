/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class E_Negatives_and_Positives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);;
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            boolean negative = false;
            long sum = 0L;
            int min = Integer.MAX_VALUE;
            int count = 0;
            int i = -1;
            while(++i < n) {
                int temp = sc.nextInt();
                if(temp < 0) {
                    negative = true;
                    count++;
                }
                arr[i] = Math.abs(temp);
                sum += arr[i];
                min = Math.min(min, arr[i]);
            }
            if(negative && (count&1) == 1) sum -= (2L*min);
            System.out.println(sum);
        }
    }
}