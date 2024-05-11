/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Roof_Construction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int temp = n-1;
            int msbSet = -1;
            while(temp > 0) {
                temp = temp>>1;
                msbSet++;
            }
            for(int i = 1; i < 1<<msbSet; i++) System.out.print(i + " ");
            System.out.print(0);
            for(int i = 1<<msbSet; i < n; i++) System.out.print(" " + i);
            System.out.println();
        }
    }
}