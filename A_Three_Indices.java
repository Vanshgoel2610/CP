/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Three_Indices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            i = 0;
            while(++i < n-1) {
                if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                    int temp1 = i+1;
                    int temp2 = i+2;
                    System.out.println("YES\n" + i + " " + temp1 + " " + temp2);
                    break;
                }
            }
            if(i == n-1) System.out.println("NO");
        }
        sc.close();
    }
}