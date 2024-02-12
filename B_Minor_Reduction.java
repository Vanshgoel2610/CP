import java.util.Scanner;
 
public class B_Minor_Reduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            String str = sc.next();
            int n = str.length();
            int i = n;
            boolean done = false;
            while(--i > 0) {
                int first = str.charAt(i)-48;
                int second = str.charAt(i-1)-48;
                if(first + second < 10) continue;
                int sum = first+second;
                String temp = str.substring(0, i-1) + sum;
                if(i+1 < n) str = temp.concat(str.substring(i+1));
                else str = temp;
                done = true;
                break;
            }
            if(!done) {
                int first = str.charAt(0)-48;
                int second = str.charAt(1)-48;
                str = first+second+str.substring(2);
            }
            System.out.println(str);
        }
        sc.close();
    }
}