import java.util.*;
 
public class B_Comparison_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                String str = sc.next();
 
                int flag;
                int count = 0, max = 0;
                if(str.charAt(0) == '>') {
                    flag = 0;
                } else {
                    flag = 1;
                }
                max = ++count;
                int index = 0;
                while(++index < str.length()) {
                    if(str.charAt(index) == '>') {
                        if(flag == 1) {
                            count = 0;
                            flag = 0;
                        }
                        count++;
                    } else {
                        if(flag == 0) {
                            count = 0;
                            flag = 1;
                        }
                        count++;
                    }
                    max = Math.max(count, max);
                }
                System.out.println(max+1);
            }
        }
    }
}