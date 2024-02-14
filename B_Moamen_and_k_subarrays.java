import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
 
public class B_Moamen_and_k_subarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int i = -1;
            ArrayList<Integer> list = new ArrayList<>(n);
            ArrayList<Integer> sortedList = new ArrayList<>();
            while(++i < n) {
                int temp = sc.nextInt();
                list.add(temp);
                sortedList.add(temp);
            }
 
            Collections.sort(sortedList);
            HashMap<Integer, Integer> map = new HashMap<>();
            i = -1;
            while(++i < n) map.put(sortedList.get(i), i);
            int count = 0;
            i = -1;
            while(++i < n) {
                if(map.get(list.get(i)) > 0 && i > 0 && sortedList.get(map.get(list.get(i))-1).equals(list.get(i-1))) continue;
                count++;
            }
            if(count <= k) System.out.println("Yes");
            else System.out.println("No");
        }
        sc.close();
    }
}