import java.util.*;

public class A_Counterexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        long r = sc.nextLong();
        if(l+2 <= r && (l&1) == 0) {
            long mid = l+1;
            r = l+2;
            System.out.println(l + " " + mid + " " + r);
        } else if(l+2+1 <= r && (l&1) == 1) {
            long mid = l+1+1;
            r = l+2+1;
            System.out.println(l+1 + " " + mid + " " + r);
        } else System.out.println(-1);
        sc.close();
    }
}