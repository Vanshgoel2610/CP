/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Fair_Numbers {
    static boolean isFair(long x) {
        boolean isFair = true;
        long num = x;
        while(num > 0) {
            long temp = num%10;
            num /= 10;
            if(temp == 0) continue;
            if(x%temp != 0) {
                isFair = false;
                break;
            }
        }
        return isFair;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            long num = sc.nextLong();
            while(!isFair(num)) num++;
            System.out.println(num);
        }
    }
}