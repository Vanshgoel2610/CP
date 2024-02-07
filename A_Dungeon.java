import java.util.Scanner;

public class A_Dungeon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int sum = a+b+c;
            int k = sum/9;
            if(sum%9 == 0 && a >= k && b >= k && c >= k) System.out.println("YES");
            else System.out.println("NO");
        }
        sc.close();
    }
}