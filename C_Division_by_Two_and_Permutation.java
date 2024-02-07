import java.util.*;

public class C_Division_by_Two_and_Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n+1];
            int i = 0;
            while(++i <= n) {
                int temp = sc.nextInt();
                    while(temp > n || arr[temp] != 0) {
                        temp /= 2;
                        if(temp == 0) break;
                    }
                arr[temp]++;
            }
            i = 0;
            while(++i <= n)
                if(arr[i] == 0) break;
            if(i == n+1) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}