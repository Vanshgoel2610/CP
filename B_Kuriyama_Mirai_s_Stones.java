/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
 
public class B_Kuriyama_Mirai_s_Stones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Long> preSum = new ArrayList<>();
        preSum.add(0L);
        ArrayList<Long> preSumSorted = new ArrayList<>();
        preSumSorted.add(0L);
        long sum = 0;
        int i = -1;
        while(++i < n) {
            long temp = sc.nextInt();
            sum += temp;
            preSum.add(sum);
            preSumSorted.add(temp);
        }
        Collections.sort(preSumSorted);
        sum = 0;
        i = 0;
        while(++i <= n) {
            sum += preSumSorted.get(i);
            preSumSorted.set(i, sum);
        }
 
        int m = sc.nextInt();
        while(m --> 0) {
            if(sc.nextInt() == 1) System.out.println(-preSum.get(sc.nextInt()-1)+preSum.get(sc.nextInt()));
            else System.out.println(-preSumSorted.get(sc.nextInt()-1)+preSumSorted.get(sc.nextInt()));
        }
        sc.close();
    }
}