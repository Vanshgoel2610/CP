import java.util.Scanner;

public class B_Sequential_Nim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            boolean first = true;
            while(++i < n) {
                int temp = sc.nextInt();
                arr[i] = temp;
                if(temp == 1) first = !first;
                else {
                    first = !first;
                    break;
                }
            }
            while(++i < n) sc.nextInt();            
            if(!first) System.out.println("First");
            else System.out.println("Second");
        }
        sc.close();
    }
}