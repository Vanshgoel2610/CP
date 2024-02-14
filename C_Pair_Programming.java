import java.util.*;

public class C_Pair_Programming {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            sc.nextLine();
            int k = sc.nextInt();
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] mono = new int[n];
            int[] poly = new int[m];
            int i = -1;
            while (++i < n) mono[i] = sc.nextInt();
            i = -1;
            while (++i < m) poly[i] = sc.nextInt();
            int first = 0;
            int second = 0;
            String str = "";
            boolean found = false;
            while(first+second < m+n) {
                found = false;
                int a = -1, b = -1;
                if(first < n) a = mono[first];
                if(second < m) b = poly[second];
                if(a == 0) {
                    k++;
                    str = str.concat(a +" ");
                    first++;
                    found = true;
                } else if(a > 0 && a <= k) {
                    str = str.concat(a +" ");
                    first++;
                    found = true;
                }
                if(b == 0) {
                    k++;
                    str = str.concat(b+" ");
                    second++;
                    found = true;
                } else if(b > 0 && b <= k) {
                    str = str.concat(b+" ");
                    second++;
                    found = true;
                }
                if(!found) break;
            }
            if(!found) System.out.println(-1);
            else System.out.println(str);
        }
        sc.close();
    }
}