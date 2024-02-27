import java.util.ArrayList;
import java.util.Scanner;

public class B_Kind_Anton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            list.add(-1);
            list.add(-1);
            list.add(-1);
            ArrayList<Integer> list1 = new ArrayList<>();
            ArrayList<Integer> list2 = new ArrayList<>();
            int i = -1;
            while(++i < n) {
                int temp = sc.nextInt();
                list1.add(temp);
                if(temp == -1 && list.getFirst() == -1) list.set(0, i);
                else if(temp == 0 && list.get(1) == -1) list.set(1, i);
                else if(temp == 1 && list.get(2) == -1) list.set(2, i);
            }
            i = -1;
            while(++i < n) list2.add(sc.nextInt());
            i = n;
            boolean finish = false;

            while(--i >= 0) {
                int temp2 = list2.get(i);
                if(temp2 == list1.get(i)) continue;
                int temp1;
                if(temp2 > 0) temp1 = list.get(2);
                else if(temp2 < 0) temp1 = list.get(0);
                else {
                    if(list1.get(i) == 1) temp1 = list.get(0);
                    else if(list1.get(i) == -1) temp1 = list.get(2);
                    else continue;
                }
                if(temp1 >= i || temp1 == -1) {
                    finish = true;
                    break;
                }
            }
            if(finish) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}