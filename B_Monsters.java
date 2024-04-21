/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class B_Monsters {
    private static class Position {
        int num;
        int index;
        Position(int num, int index) {
            this.num = num;
            this.index = index;
        }
    }
    private static class sort implements Comparator<Position> {
        public int compare(Position p1, Position p2) {
            if(p1.num < p2.num) return -1;
            else if(p1.num > p2.num) return 1;
            else {
                if(p1.index < p2.index) return 1;
                else if(p1.index > p2.index) return -1;
                else return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            ArrayList<Position> list = new ArrayList<>();
            int i = -1;
            while(++i < n) {
                int temp = sc.nextInt()%k;
                list.add(new Position((temp) == 0? k: temp, i));
            }
            list.sort(new sort());
            i = n;
            while(--i >= 0) System.out.print(list.get(i).index+1 + " ");
            System.out.println();
        }
        sc.close();
    }
}