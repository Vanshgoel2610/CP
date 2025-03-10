import java.util.*;

public class C_Creating_Keys_for_StORages_Has_Become_My_Main_Skill {
    private static String binary(int a) {
        String binary = "";

        while(a > 0) {
            int temp = ((a&1) == 1)? 1: 0;
            a >>= 1;
            binary = temp+binary;
        }

        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {

                // The implementation is not correct.

            int n = sc.nextInt(); int x = sc.nextInt();

            String binary = binary(x);
            int pos = -1;
            for(int i = 0; i < binary.length(); i++) {
                if(binary.charAt(i) == '0') {
                    pos = i;
                    break;
                }
            }
            
            int ans = 0;
            if(pos == -1) {
                int ceil = (int)Math.ceil(x/2f);
                if(n > ceil) {
                    for(int i = 1; i <= n; i++) {
                        System.out.print(ans + " ");
                        ans++;
                        if(ans == x) ans = 0;
                    }
                } else {
                    for(int i = 0; i < n-1; i++) {
                        System.out.print(ans + " ");
                        ans++;
                    }
                    System.out.print(x + " ");
                }
            } else {
                int last = (1 << pos)-1;
                for(int i = x; i >= x-last; i--) System.out.print(i + " ");
                int times = x-last-1;
                for(int i = 1; i <= times; i++) {
                    System.out.print(ans + " ");
                    ans++;
                    if(ans == x) ans = 0;
                }
            }

            System.out.println();
        }

        sc.close();
    }
}