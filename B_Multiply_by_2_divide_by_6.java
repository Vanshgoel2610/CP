import java.util.*;
 
public class B_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while(t --> 0) {
                int n = sc.nextInt();
                if(n == 1 || n == 6) {
                    System.out.println(n/6);
                    continue;
                }
 
                if(n%3 != 0) {
                    System.out.println(-1);
                    continue;
                }
                int step = 0;
                while(n > 1) {
                    step++;
                    if(n%6 != 0) {
                        n *= 2;
                        continue;
                    }
                    n /= 6;
                }
                System.out.println((n == 1)? step: -1);
            }
        }
    }
}