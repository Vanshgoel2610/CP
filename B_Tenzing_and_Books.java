/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    static Scanner sc = new Scanner(System.in);
    static boolean matchingBits(int num, int x) {      // T.C :- O(30)
        while(num > 0) {
            int bit1 = num&1;
            int bit2 = x&1;
            if(bit1 == 1 && bit2 == 0) return false;
            num >>= 1;
            x >>= 1;
        }
        return true;
    }

    // Logic:-
    /* Go through the entire stack one by one. For the first stack, if the temp <= x and all the bits are matched then it can be added to the "or array".
    *  else just move to the another stack till the temp is matching with x.
    *  At last if the "or array" is equals to x then print("YES") else "NO".
    * */
    static boolean solve(int n, int x, int[] or) {
        boolean found = x == or[0];   // Checking whether x is initially 0 or not.
        boolean not_matched = false;
        int i = -1;
        while(++i < n) {
            int temp = sc.nextInt();
            if(not_matched || found) continue;
            if(temp <= x && matchingBits(temp, x)) or[0] |= temp;
            else not_matched = true;
            if(or[0] == x) found = true;
        }
        return found;
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            boolean found = false;
            int[] or = {0};
            for(int i = 0; i < 3; i++) found |= solve(n, x, or);
            if(found) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}