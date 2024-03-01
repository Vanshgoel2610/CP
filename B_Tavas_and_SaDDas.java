import java.util.Scanner;
 
public class B_Tavas_and_SaDDas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int l = n.length();
        int position = l;
        int ans = 0;
        int i = -1;
        while(++i < l) {
            if(n.charAt(i) == '4') ans += (int)Math.pow(2, position-1);
            else ans += 2*(int)Math.pow(2, position-1);
            position--;
        }
        System.out.println(ans);
    }
}