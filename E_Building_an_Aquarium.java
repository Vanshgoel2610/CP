import java.util.Scanner;

public class E_Building_an_Aquarium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            long l = 1;
            long r = 10000000000L;
            while(l < r-1) {
                long mid = l+(r-l)/2;
                long amount = 0;
                i = -1;
                while(++i < n) amount += Math.max(0, mid-arr[i]);
                if(amount > x) r = mid;
                else l = mid;
            }
            System.out.println(l);
        }
        sc.close();
    }
}