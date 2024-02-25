import java.util.Arrays;
import java.util.Scanner;

public class A_Yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[1001];
        for (int i = 0; i < n; ++i) a[scanner.nextInt()]++;
        Arrays.sort(a);
        System.out.println((a[1000] <= (n + 1) / 2) ? "YES" : "NO");
        scanner.close();
    }
}