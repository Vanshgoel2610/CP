/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Triangles_on_a_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int[][] arr = new int[4][2];
            for(int i = 0; i < 4; i++) {
                int k = sc.nextInt()-1;
                arr[i][0] = sc.nextInt();
                while(k --> 0) arr[i][1] = sc.nextInt();
            }
            long ans = getAns(arr, y, x);
            System.out.println(ans);
        }
    }
    private static long getAns(int[][] arr, int y, int x) {
        long ans = 0;
        for(int i = 0; i < 4; i++) {
            long diff = arr[i][1]- arr[i][0];
            int j = (i+1)%4;
            int times = 3;
            while(times --> 0) {
                for(int k = 0; k < 2; k++) {
                    if(i < 2) {
                        if(j < 2) ans = Math.max(ans, y*diff);  // Here diff is the base and y is the y-axis
                        else ans = Math.max(ans, arr[j][k]*diff);
                    } else {
                        if(j < 2) ans = Math.max(ans, arr[j][k]*diff);
                        else ans = Math.max(ans, x *diff);
                    }
                }
                j = (j+1)%4;
            }
        }
        return ans;
    }
}