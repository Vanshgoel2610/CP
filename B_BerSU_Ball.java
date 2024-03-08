/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.*;

public class B_BerSU_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] boys = new int[n];
        int i = -1;
        while(++i < n) boys[i] = sc.nextInt();
        int m = sc.nextInt();
        int[] girls = new int[m];
        i = -1;
        while(++i < m) girls[i] = sc.nextInt();
        Arrays.sort(boys);
        Arrays.sort(girls);
        int sum = 0;
        for(i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(Math.abs(boys[i]-girls[j]) <= 1) {
                    sum++;
                    girls[j] = 102;
                    break;
                }
            }
        }

        System.out.println(sum);
        sc.close();
    }
}