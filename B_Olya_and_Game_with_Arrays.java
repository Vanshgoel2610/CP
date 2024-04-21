/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Scanner;

public class B_Oly_and_Game_with_Arrays {
    private static class Two {
        int num;
        int index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            int i = -1;
            while(++i < n) {
                list.add(new ArrayList<>());
                for(int j = 0; j < 2; j++) list.get(i).add(Integer.MAX_VALUE);
            }
            Two second = new Two();
            second.index = -1;
            second.num = Integer.MAX_VALUE;
            int min = Integer.MAX_VALUE;
            i = -1;
            while(++i < n) {
                int length = sc.nextInt();
                ArrayList<Integer> array = list.get(i);
                int j = -1;
                while(++j < length) {
                    int temp = sc.nextInt();
                    if(temp < array.getFirst()) {
                        array.set(1, array.getFirst());
                        array.set(0, temp);
                    } else if(temp < array.get(1)) array.set(1, temp);
                    array.add(temp);
                }
                if(second.num > array.get(1)) {
                    second.index = i;
                    second.num = array.get(1);
                }
                min = Math.min(min, array.getFirst());
            }
            long ans = min;
            i = -1;
            while(++i < n) {
                if(i == second.index) continue;
                ans += list.get(i).get(1);
            }
            System.out.println(ans);
        }
        sc.close();
    }
}