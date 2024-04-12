/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Forked {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xK = sc.nextInt();
            int yK = sc.nextInt();
            int xQ = sc.nextInt();
            int yQ = sc.nextInt();
            int count = 0;

            if(a == b) {
                int[] dx = {a,a,-a,-a};
                int[] dy = {b,-b,b,-b};
                for(int i = 0; i < 4; i++) {
                    for(int j = 0; j < 4; j++) {
                        int king_Xpos = xK+dx[i];
                        int king_Ypos = yK+dy[i];
                        int queen_Xpos = xQ+dx[j];
                        int queen_Ypos = yQ+dy[j];
                        if(king_Xpos == queen_Xpos && king_Ypos == queen_Ypos) count++;
                    }
                }
            } else {
                int[] dx = {a,a,-a,-a,b,b,-b,-b};
                int[] dy = {b,-b,b,-b,a,-a,-a,a};
                for(int i = 0; i < 8; i++) {
                    for(int j = 0; j < 8; j++) {
                        int king_Xpos = xK+dx[i];
                        int king_Ypos = yK+dy[i];
                        int queen_Xpos = xQ+dx[j];
                        int queen_Ypos = yQ+dy[j];
                        if(king_Xpos == queen_Xpos && king_Ypos == queen_Ypos) count++;
                    }
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}