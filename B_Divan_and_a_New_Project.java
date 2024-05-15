import java.util.*;
 
public class B_Divan_and_a_New_Project {
    static class Two {
        public int index;
        public int num;
 
        public Two(int index, int num) {
            this.index = index;
            this.num = num;
        }
    }
 
    static class Sort implements Comparator<Two> {
        @Override
        public int compare(Two t1, Two t2) {
            if(t1.num > t2.num) return -1;      // Reverse comparison for sorting in descending order
            else if(t1.num < t2.num) return 1;
            else return 0;
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            ArrayList<Two> list = new ArrayList<>();
            for (int i = 0; i < n; ++i) {
                int num = scanner.nextInt();
                list.add(new Two(i, num));
            }
            list.sort(new Sort());
            long[] ans = new long[n];
            long time = 0;
            int position = 1;
            for (int i = 0; i < n; ++i) {
                Two object = list.get(i);
                int index = object.index;
                long num = object.num;
                if (position > 0) {
                    ans[index] = position;
                    position = -position;
                } else {
                    ans[index] = position;
                    position = -position + 1;
                }
                time += Math.abs(ans[index]) * 2 * num;
            }
            System.out.println(time);
            System.out.print(0);
            for (int i = 0; i < n; ++i) {
                System.out.print(" " + ans[i]);
            }
            System.out.println();
        }
        scanner.close();
    }
}