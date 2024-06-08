import java.util.Scanner;

public class D_Three_Activities {
    private static int[] getBest3(int[] c) {
        int mx1 = -1, mx2 = -1, mx3 = -1;
        for (int i = 0; i < c.length; i++) {
            if (mx1 == -1 || c[i] > c[mx1]) {
                mx3 = mx2;
                mx2 = mx1;
                mx1 = i;
            } else if (mx2 == -1 || c[i] > c[mx2]) {
                mx3 = mx2;
                mx2 = i;
            } else if (mx3 == -1 || c[i] > c[mx3]) mx3 = i;
        }
        return new int[]{mx1, mx2, mx3};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            int[] c = new int[n];

            for(int i = 0; i < n; i++) a[i] = sc.nextInt();
            for(int i = 0; i < n; i++) b[i] = sc.nextInt();
            for (int j = 0; j < n; j++) c[j] = sc.nextInt();

            int[] bestA = getBest3(a);
            int[] bestB = getBest3(b);
            int[] bestC = getBest3(c);

            int ans = 0;
            for (int x : bestA) {
                for (int y : bestB) {
                    for (int z : bestC) {
                        if (x != y && x != z && y != z) ans = Math.max(ans, a[x] + b[y] + c[z]);
                    }
                }
            }
            System.out.println(ans);
        }
        sc.close();
    }
}