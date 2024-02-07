import java.util.*;
 
public class B_Effective_Approach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int i = 0;
            while(++i <= n) arr[sc.nextInt()] = i;
            int m = sc.nextInt();
            i = -1;
            long sum1 = 0;
            long sum2 = 0;
            while(++i < m) {
                int p = sc.nextInt();
                sum1 += arr[p];
                sum2 += n-arr[p]+1;
            }
            System.out.println(sum1 + " " + sum2);
        }
        sc.close();
    }
}