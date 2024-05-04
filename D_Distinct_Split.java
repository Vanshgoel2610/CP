/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.ArrayList;
import java.util.Scanner;
 
public class D_Distict_Split {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            String str = sc.next();
            int[] prefix = new int[n];
            int[] suffix = new int[n];
 
            ArrayList<Character> list = new ArrayList<>();
            int position = 0;
            int i = -1;
            while(++i < n) {
                char temp = str.charAt(i);
                if(!list.contains(temp)) {
                    position++;
                    list.add(temp);
                }
                prefix[i] = position;
            }
 
            position = 0;
            list = new ArrayList<>();
            i = n;
            while(--i >= 0) {
                char temp = str.charAt(i);
                if(!list.contains(temp)) {
                    position++;
                    list.add(temp);
                }
                suffix[i] = position;
            }
 
            int first;
            int second;
            int max = 0;
            i = -1;
            while(++i < n-1) {
                first = prefix[i];
                second = suffix[i+1];
                max = Math.max(max, first+second);
            }
            System.out.println(max);
        }
        sc.close();
    }
}