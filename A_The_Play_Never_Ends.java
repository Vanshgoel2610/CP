import java.util.*;

public class A_The_Play_Never_Ends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int k = sc.nextInt()-1;
            System.out.println((k%3 == 0)? "YES": "NO");
        }
    }
}