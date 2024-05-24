/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Li_Hua_and_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[][] rotate = new int[n][n];
            for(int i = 0; i < n; i++) for(int j = 0; j < n; j++) rotate[i][j] = sc.nextInt();
 
            boolean finish = false;
            for(int i = 0; i < n/2; i++) {
                for(int j = 0; j < n; j++) {
                    int temp1 = rotate[i][j];
                    int temp2 = rotate[n-i-1][n-j-1];
                    if(temp1 != temp2) {
                        if(k > 0) k--;
                        else {
                            finish = true;
                            break;
                        }
                    }
                }
                if(finish) break;
            }
            if((n&1) == 1 && !finish) {
                for(int i = 0; i < n/2; i++) {
                    int temp1 = rotate[n/2][i];
                    int temp2 = rotate[n/2][n-i-1];
                    if(temp1 != temp2) {
                        if(k > 0) k--;
                        else {
                            finish = true;
                            break;
                        }
                    }
                }
            }
            if(finish) System.out.println("NO");
            else if((n&1) == 1) System.out.println("YES");
            else if((k&1) == 1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}