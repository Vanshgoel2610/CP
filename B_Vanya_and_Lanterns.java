/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class B_Vanya_and_Lanterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int i = -1;
        ArrayList<Integer> list = new ArrayList<>();
        while (++i < n) list.add(sc.nextInt());
        Collections.sort(list);
        double max = 2*Math.max(list.getFirst(), (l-list.get(n - 1)));
        i = 0;
        while (++i < n) max = Math.max(max, (list.get(i)-list.get(i-1)));
        double ans = max/2.0;
        System.out.printf("%.10f", ans);
        sc.close();
    }
}