/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Same_Parity_Summands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            if(k > n) System.out.println("NO");
            else if(k == n) {
                System.out.println("YES");
                for(int i = 0; i < k; i++) System.out.print(1+" ");
                System.out.println();
            } else {
                long quotient = n/k;
                int remainder = n%k;
                if(((quotient+remainder)%2 == 0 && quotient%2 == 0) || ((quotient+remainder)%2 != 0 && quotient%2 != 0)) {
                    System.out.println("YES");
                    for(int i = 0; i < k-1; i++) System.out.print(quotient+" ");
                    System.out.println(quotient+remainder);
                } else if((k-1)%2 != 0 || quotient == 1) System.out.println("NO");
                else {
                    System.out.println("YES");
                    for(int i = 1; i <= k/2; i++) {
                        System.out.print(quotient-1+" ");
                        System.out.print(quotient+1+" ");
                    }
                    System.out.print(quotient+remainder);
                    System.out.println();
                }
            }
        }
        sc.close();
    }
}