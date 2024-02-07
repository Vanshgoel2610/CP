import java.util.Scanner;

public class B_Caisa_and_Pylons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        while(n --> 0) max = Math.max(max, sc.nextInt());
        System.out.println(max);
        sc.close();
    }
}