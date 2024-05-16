/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class B_Deja_Vu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arr = new int[n];
            HashSet<Integer> set = new LinkedHashSet<>();
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            i = -1;
            while(++i < q) set.add(sc.nextInt());

            i = -1;
            while(++i < n) {
                int temp = arr[i];
                Iterator<Integer> it = set.iterator();
                while(it.hasNext()) {
                    int num = it.next();
                    if(temp%(int)(Math.pow(2, num)) == 0) temp += (int)Math.pow(2, num-1);
                }
                arr[i] = temp;
            }
            i = -1;
            while(++i < n) System.out.print(arr[i] + " ");
            System.out.println();
        }
    }
}