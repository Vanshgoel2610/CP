/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n*k];
            int i = -1;
            while(++i < n*k) arr[i] = sc.nextInt();
            long total = 0;
            if(n==2){
                i = 0;
                while(i < n*k) {
                    total += arr[i];
                    i += 2;
                }
                System.out.println(total);
            } else {
                int median = (n+1)/2;
                int left = n-median;
                left++;
                int boxes = 0;
                int x = 1;
                i = n*k;
                while(--i >= 0) {
                    if(x%left == 0) {
                        total += arr[i];
                        boxes++;
                    }
                    x++;
                    if(boxes >= k) break;
                }
                System.out.println(total);
            }
        }
        sc.close();
    }
}