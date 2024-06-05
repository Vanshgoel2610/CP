/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.HashSet;
import java.util.Scanner;

public class B_A_Perfectly_Balanced_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String str = sc.next();
            HashSet<Character> set = new HashSet<>();
            for(int i = 1; i < str.length(); i++) {
                if(str.charAt(i) != str.charAt(i-1)) {
                    set.add(str.charAt(i));
                    set.add(str.charAt(i-1));
                }
            }
            int size = set.size();
            boolean ending = false;
            for(int i = 0; i <= str.length()-size; i++) {
                HashSet<Character> set2 = new HashSet<>();
                for(int j = i; j < i+size; j++) set2.add(str.charAt(j));
                if(set2.size() != size) {
                    ending = true;
                    break;
                }
            }
            if(!ending) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}