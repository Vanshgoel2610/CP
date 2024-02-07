import java.util.Scanner;

public class B_Bad_Prices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt();
            int last = arr[n-1];
            int ans = 0;
            i = n-1;
            while(--i >= 0) {
                if(arr[i] <= last) last = arr[i];
                else ans++;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}