/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Chemistry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String str = sc.next();
            int[] arr = new int[26];
            for(int i = 0; i < n; i++) arr[str.charAt(i)-97]++;
            int count = 0;
            for(int i = 0; i < 26; i++) if(arr[i]%2 != 0) count++;
            count -= k;
            if(count <= 1) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}