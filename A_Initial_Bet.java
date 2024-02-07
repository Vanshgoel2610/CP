import java.util.Scanner;

public class A_Initial_Bet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int c4 = sc.nextInt();
        int c5 = sc.nextInt();
        float avg = (c1+c2+c3+c4+c5)/5f;
        if(avg%(int)avg == 0) System.out.println((int)avg);
        else System.out.println(-1);
        sc.close();
    }
}