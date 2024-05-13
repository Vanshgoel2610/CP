/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class B_Erase_First_orSecond_Letter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            String str = sc.next();
            ArrayList<Character> list = new ArrayList<>();
            int ans = 0;
            for(int i = 0; i < n; i++) {
                if(!list.contains(str.charAt(i))) {
                    list.add(str.charAt(i));
                    ans += n-i;
                }
            }
            System.out.println(ans);
        }
    }
}