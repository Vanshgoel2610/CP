import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class D_Double_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            HashSet<String> set = new HashSet<>();
            int i = -1;
            while(++i < n) {
                String temp = sc.next();
                list.add("0");
                list.set(i, temp);
                set.add(temp);
            }
            i = -1;
            while(++i < n) {
                boolean found = false;
                int j = 0;
                while(++j < list.get(i).length()) {
                    String s1 = list.get(i).substring(0, j);
                    String s2 = list.get(i).substring(j);
                    if(set.contains(s1) && set.contains(s2)) found = true;
                }
                System.out.print((found) ? 1 : 0);
            }
            System.out.println();
            set.clear();
        }
        sc.close();
    }
}