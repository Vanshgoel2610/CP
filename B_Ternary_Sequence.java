/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Ternary_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int[] a = new int[3];
            int[] b = new int[3];
            int i = -1;
            while(++i < 3) a[i] = sc.nextInt();
            i = -1;
            while(++i < 3) b[i] = sc.nextInt();
            // when a(i) == 2;
            int temp, sum = 0;
            while(a[2] > 0) {
                if(b[1] > 0) {
                    temp = Math.min(a[2], b[1]);
                    b[1] -= temp;
                    sum += 2*temp;
                } else if(b[2] > 0) {
                    temp = Math.min(a[2], b[2]);
                    b[2] -= temp;
                } else {
                    temp = Math.min(a[2], b[0]);
                    b[0] -= temp;
                }
                a[2] -= temp;
            }
            // for sequence when a(i) == 0. Here i am only trying to remove the number of 2's in sequence b because it can give negative sum for a's sequence 1
            if(b[2] > 0) b[2] -= a[0];

            while(a[1] > 0) {
                if(b[1] > 0) {
                    temp = Math.min(a[1], b[1]);
                    b[1] -= temp;
                }
                else if(b[0] > 0) {
                    temp = Math.min(a[1], b[0]);
                    b[0] -= temp;
                }
                else {
                    temp = Math.min(a[1], b[2]);
                    b[2] -= temp;
                    sum -= 2*temp;
                }
                a[1] -= temp;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}