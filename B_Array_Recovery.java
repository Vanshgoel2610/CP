import java.util.ArrayList;
import java.util.Scanner;
 
public class B_Array_Recovery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            int n = sc.nextInt();
            ArrayList<Integer> d = new ArrayList<>();
            int i = -1;
            while(++i < n) d.add(sc.nextInt());
            ArrayList<Integer> a = new ArrayList<>();
            a.add(d.getFirst());
            i = 0;
            while(++i < n) {
                int temp = d.get(i);
                int _temp = a.get(i-1);
                int temp1 = _temp-temp;
                int temp2 = _temp+temp;
                if(temp1 >= 0 && temp2 >= 0 && temp1 != temp2) break;
                a.add(Math.max(temp1, temp2));
            }
            if(a.size() == d.size()) {
                i = -1;
                while(++i < n) System.out.print(a.get(i) + " ");
                System.out.println();
            } else System.out.println(-1);
        }
        sc.close();
    }
}