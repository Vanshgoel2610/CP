/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Scanner;

public class C_Paint_the_Array {
    public static long helper(long a, long b) {
        if(b == 0) return a;
        return helper(b, a%b);
    }
    public static long gcd(ArrayList<Long> list, int n, int startIndex) {
        long gcd = list.get(startIndex);
        int i = startIndex;
        while((i += 2) < n) {
            gcd = helper(list.get(i), gcd);
        }
        return gcd;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            ArrayList<Long> list = new ArrayList<>();
            int i = -1;
            while(++i < n) list.add(sc.nextLong());
            long even = gcd(list, n, 0);
            long odd = gcd(list, n, 1);
            boolean flag = false;
            i = -2;
            while((i += 2) < n) {
                if(list.get(i)%odd == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                System.out.println(odd);
                continue;
            }
            flag = false;
            i = -1;
            while((i += 2) < n) {
                if(list.get(i)%even == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag) System.out.println(even);
            else System.out.println(0);
        }
        sc.close();
    }
}