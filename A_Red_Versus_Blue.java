/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class A_Red_Versus_Blue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            int b = sc.nextInt();
            int spaces = b+1;
            int divide = r/spaces;
            int remainder = r%spaces;
            String temp = "";
            int i = -1;
            while(++i < divide) temp = temp.concat("R");
            String ans = "";
            while(ans.length() < n) {
                ans = ans.concat(temp);
                if(remainder-- > 0) ans = ans.concat("R");
                if(b --> 0) ans = ans.concat("B");
            }
            System.out.println(ans);
        }
    }
}