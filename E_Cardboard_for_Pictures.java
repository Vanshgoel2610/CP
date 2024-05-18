/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class E_Cardboard_for_Pictures {
    private static long findW(long[] paintings, long c, long w) {
        long sum = 0;
        for(long num: paintings) {
            sum += (num+2*w)*(num+2*w);
            if(sum > c) break;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();
            long[] paintings = new long[n];
            int i = -1;
            while(++i < n) paintings[i] = sc.nextInt();
            int start = 1;
            int end = 1000000000;
 
            while(end-start > 1) {
                int mid = start+(end-start)/2;
                long sum = findW(paintings, c, mid);
                if(sum < c) start = mid+1;
                else end = mid;
            }
            if(findW(paintings, c, end) == c) System.out.println(end);
            else System.out.println(start);
        }
    }
}