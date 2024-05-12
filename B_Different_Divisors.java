/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class B_Different_Divisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5000];
        int num = 2;
        int i = 0;
        while(i < arr.length) {
            boolean found = true;
            if(num != 2 && num != 3) {
                for(int j = 2; j <= num/2; j++) {
                    if(num%j == 0) {
                        found = false;
                        break;
                    }
                }
            }
            if(found) {
                arr[i] = num;
                i++;
            }
            num++;
        }
        int t = sc.nextInt();
        while(t --> 0) {
            int d = sc.nextInt();
            i = 0;
            int[] a = new int[2];
            int position = 0;
            int previous = 1;
            while(position != 2) {
                if(arr[i]-previous >= d) {
                    a[position] = arr[i];
                    previous = a[position];
                    position++;
                }
                i++;
            }
            System.out.println(a[0]*a[1]);
        }
    }
}