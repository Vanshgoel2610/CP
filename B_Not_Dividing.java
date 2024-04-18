/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Not_Dividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            while(++i < n) arr[i] = sc.nextInt()+1;
            i = 0;
            while(++i < n) {
                while(arr[i]%arr[i-1] == 0) arr[i]++;
                System.out.print(arr[i-1]+" ");
            }
            System.out.println(arr[n-1]);
        }
        sc.close();
    }
}