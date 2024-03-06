/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class A_Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int times = n/m;
        if(times > 0) {
            if(times*b <= n*a) {
                sum += times*b;
                n -= times*m;
            } else {
                sum += n*a;
                n = 0;
            }
        }
        if(n > 0) sum += Math.min(b, n*a);
        System.out.println(sum);
        sc.close();
    }
}