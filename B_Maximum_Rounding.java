/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन । मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्मणि ॥   */

import java.util.*;

public class B_Maximum_Rounding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            StringBuilder a = new StringBuilder(sc.next());
            a.reverse();
            a.append('0');
            int i = 0;
            int k = 0;
            while(++i < a.length()) {
                if(a.charAt(i-1) >= '5') {
                    while(a.charAt(i) == '9') {
                        a.setCharAt(i, '0');
                        i++;
                    }
                    k = i;
                    a.setCharAt(i, (char)(a.charAt(i)+1));
                }
            }
            while(k --> 0) a.setCharAt(k, '0');
            a.reverse();
            if(a.charAt(0) == '0') a = new StringBuilder(a.substring(1));
            System.out.println(a);
        }
        sc.close();
    }
}