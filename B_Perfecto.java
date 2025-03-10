/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.*;

public class B_Perfecto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> squares = new HashSet<>();
        for(int i = 1; i <= (int)Math.ceil(Math.sqrt(5*1e5)); i++) squares.add(i*i);
        int t = sc.nextInt();
        while(t --> 0) {
            int k = sc.nextInt();
            HashSet<Integer> add = new HashSet<>();

            int sum = 0;
            for(int i = 1; i <= k; i++) {
                for(int j = 1; j < 10; j++) {
                    if(i == 1 && squares.contains(j)) continue;
                    if(add.contains(j) || squares.contains(sum+j)) continue;
                    add.add(j);
                    sum += j;
                    break;
                }
            }
            HashSet<Integer> distinct = new HashSet<>();
            for(int e: add) {
                if(e > k) break;
                distinct.add(e);
            }
            if(distinct.size() < k) {
                System.out.println(-1);
                continue;
            }
            for(int e: add) System.out.print(e + " ");
            System.out.println();
        }
        sc.close();
    }
}