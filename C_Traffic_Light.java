/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.*;
 
public class Ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            char c = sc.next().charAt(0);
            int ans = 0;
            String str = sc.next();
            str = str.concat(str);
            ArrayList<Integer> green = new ArrayList<>();
            ArrayList<Integer> signal = new ArrayList<>();
            boolean regular = false;
            int i = -1;
            while(++i < n) {
                char temp = str.charAt(i);
                if(temp == 'g') {
                    green.add(i);
                    regular = false;
                }
                else if(temp == c) {
                    if(!regular) signal.add(i);
                    regular = true;
                } else regular = false;
            }
            green.add(str.indexOf('g', i));
 
            while(!signal.isEmpty()) {
                if(signal.getFirst() < green.getFirst()) {
                    ans = Math.max(ans, green.getFirst()-signal.getFirst());
                    signal.removeFirst();
                } else green.removeFirst();
            }
            System.out.println(ans);
        }
    }
}