import java.util.Arrays;
import java.util.Scanner;

public class A_Yaroslav_and_Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a, 0, n);
        int continuous = 1;
        int maxContinuous = 1;
        for (int i = 1; i < n; ++i) {
            if (a[i] == a[i - 1]) {
                continuous += 1;
                if (continuous > maxContinuous) {
                    maxContinuous = continuous;
                }
            } else {
                continuous = 1;
            }
        }
        System.out.println((maxContinuous <= (n + 1) / 2) ? "YES" : "NO");
    }
}