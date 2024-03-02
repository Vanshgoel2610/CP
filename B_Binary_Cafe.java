import java.util.Scanner;
 
public class B_Binary_Cafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t --> 0) {
            System.out.println(Math.min(sc.nextInt()+1, (int)Math.pow(2, sc.nextInt())));
        }
        sc.close();
    }
}