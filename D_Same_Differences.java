/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.HashMap;
import java.util.Scanner;

public class D_Same_Differences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            HashMap<Integer, Integer> map = new HashMap<>();
            long sum = 0;
            for(int i = 0; i < n; i++) {
                int a = sc.nextInt()-i;
                if(map.containsKey(a)) {
                    sum += map.get(a);
                    map.put(a, map.get(a)+1);
                } else map.put(a, 1);
            }
            System.out.println(sum);
        }
        sc.close();
    }
}