/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Chewbacca_and_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.next());
        int n = str.length();
        for(int i = 0; i < n; i++) {
            if(str.charAt(i) >= '5' && str.charAt(i) <= '9') {
                if((i == 0 && str.charAt(i) != '9') || i > 0) str.setCharAt(i, (char)(9-Integer.parseInt(str.charAt(i)+"")+48));
            }
        }
        System.out.println(str);
        sc.close();
    }
}