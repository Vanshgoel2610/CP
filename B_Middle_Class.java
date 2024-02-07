import java.util.*;

public class B_Middle_Class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            long x = sc.nextLong();
            List<Long> list = new ArrayList<>();
            long max = 0L;
            int i = -1;
            while(++i < n) {
                long temp = sc.nextLong();
                if(temp >= x) {
                    max += temp;
                    continue;
                }
                list.add(0L);
                list.set(list.size()-1, temp);
            }
            if(max == 0) {
                System.out.println(0);
                continue;
            }
            Collections.sort(list);
            int size = list.size();
            i = size;
            long extra = 0L;
            while(--i >= 0) {
                extra += list.get(i);
                int diff = n-i;
                if(((1.0*max+extra)/diff) < x) break;
                list.remove(size-1);
                size = list.size();
            }
            if(i == -1) System.out.println(n);
            else System.out.println(n-i-1);
        }
        sc.close();
    }
}