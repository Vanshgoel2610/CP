/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Swap_and_Delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String str = sc.next();
            int n = str.length();
            int[] arrCount = new int[2];
            int i = -1;
            while(++i < n) arrCount[str.charAt(i)-'0']++;
            i = -1;
            while(++i < n) {
                int temp = str.charAt(i)-'0';
                int find = Math.abs(temp-1);
                if(arrCount[find] > 0) arrCount[find]--;
                else break;
            }
            System.out.println(n-i);
        }
        sc.close();
    }
}