/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class B_Collecting_Game {
    static class Two {
        int num;
        int index;
        Two(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
    private static class Sort implements Comparator<Two> {
        public int compare(Two a, Two b) {
            if(a.num > b.num) return 1;
            else if(a.num < b.num) return -1;
            else return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            ArrayList<Two> list = new ArrayList<>();
            long[] prefixSum = new long[n];
            long sum = 0;
            int i = -1;
            while(++i < n) list.add(new Two(sc.nextInt(), i));
            list.sort(new Sort());
            i = -1;
            while(++i < n) {
                int temp = list.get(i).num;
                sum += temp;
                prefixSum[i] = sum;
            }

            long[] ans = new long[n];
            ans[list.get(n-1).index] = n-1;
            i = n-1;
            while(--i >= 0) {
                if(prefixSum[i] >= list.get(i+1).num) ans[list.get(i).index] = ans[list.get(i+1).index];
                else ans[list.get(i).index] = i;
            }
            i = -1;
            while(++i < n) System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}