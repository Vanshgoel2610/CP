/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Scanner;

public class B_Sequence_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();
            int prev = sc.nextInt();
            list.add(prev);
            int i = 0;
            while(++i < n) {
                int curr = sc.nextInt();
                if(curr < prev) list.add(curr);
                list.add(curr);
                prev = curr;
            }

            n = list.size();
            System.out.println(n);
            i = -1;
            while(++i < n) System.out.print(list.get(i) + " ");
            System.out.println();
        }
    }
}