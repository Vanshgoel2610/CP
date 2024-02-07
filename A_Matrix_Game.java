import java.util.*;

public class A_Matrix_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] row = new int[n];
            int[] column = new int[m];
            int min;
            int i = -1;
            while(++i < n) {
                int j = -1;
                while(++j < m) {
                    int input = sc.nextInt();
                    if(input == 1) {
                        row[i] = 1;
                        column[j] = 1;
                    }
                }
            }
            i = -1;
            int count = 0;
            while(++i < n) {
                if(row[i] == 0) count++;
            }
            min = count;
            i = -1;
            count = 0;
            while(++i < m) {
                if(column[i] == 0) count++;
            }
            min = Math.min(min, count);
            int mask = min&1;
            if(mask == 0) System.out.println("Vivek");
            else System.out.println("Ashish");
        }
        sc.close();
    }
}