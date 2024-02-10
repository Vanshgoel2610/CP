import java.util.Scanner;

public class B_GCD_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int i = -1;
            int evenPosition = 0;
            int oddPosition = 0;
            int pairs = 0;
            while(++i < 2*n) {
                int temp = sc.nextInt();
                if(pairs == n-1) continue;
                if(temp%2 == 0) {
                    if(evenPosition > 0) {
                        int print = i+1;
                        System.out.println(evenPosition + " " + print);
                        evenPosition = 0;
                        pairs++;
                    } else evenPosition = i+1;
                } else {
                    if(oddPosition > 0) {
                        int print = i+1;
                        System.out.println(oddPosition + " " + print);
                        oddPosition = 0;
                        pairs++;
                    } else oddPosition = i+1;
                }
            }
        }
        sc.close();
    }
}