/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
 
public class A_Helmets_in_Night_Light {
    private static class Random {
        long a;
        long b;
    }
    public static class sort implements Comparator<Random> {
        @Override
        public int compare(Random o1, Random o2) {
            if(o1.b < o2.b) return -1;
            else if(o1.b > o2.b) return 1;
            else {
                if(o1.a < o2.a) return 1;
                else if(o1.a > o2.a) return -1;
                else return 0;
            }
        }
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Random> list = new ArrayList<>();
            int i = -1;
            while(++i < n) {
                list.add(new Random());
                list.get(i).a = sc.nextInt();
            }
            i = -1;
            while(++i < n) list.get(i).b = Math.min(sc.nextInt(), k);
            list.sort(new sort());
            long ans = k;
            long res = n-1;
            i = 0;
            while(i < n-1) {
                Random temp = list.get(i);
                ans += temp.b*Math.min(res, temp.a);
                res -= Math.min(res, temp.a);
                i++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}