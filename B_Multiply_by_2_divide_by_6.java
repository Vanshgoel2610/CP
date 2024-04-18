import java.util.*;
 
public class B_Multiply_by_2_divide_by_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int count = 0;
            while(n != 1) {
                while(n%6 == 0) {
                    n /= 6;
                    count++;
                }
                if(n != 1) {
                    if(n%2 == 0) break;
                    else n *= 2;
                    count++;
                }
            }
            if(n != 1) System.out.println(-1);
            else System.out.println(count);
        }
        sc.close();
    }
}