/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */
 
import java.util.Scanner;
 
public class B_Sort_the_Subarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] _a = new int[n];
            int i = -1;
            while(++i < n) a[i] = sc.nextInt();
            i = -1;
            while(++i < n) _a[i] = sc.nextInt();
 
            int first = -1, second = -1, _first = -1, _second = -1;
            i = -1;
            while(++i < n) {
                if(a[i] != _a[i]) {
                    first = i;
                    break;
                }
            }
            i = n;
            while(--i >= 0) {
                if(a[i] != _a[i]) {
                    second = i;
                    break;
                }
            }
            i = first;
            while(--i >= 0) {
                if(_a[i] <= _a[i+1]) _first = i;
                else break;
            }
            i = second;
            while(++i < n) {
                if(_a[i-1] <= _a[i]) _second = i;
                else break;
            }
            if(_first != -1) System.out.print(_first+1 + " ");
            else System.out.print(first+1 + " ");
            if(_second != -1) System.out.print(_second+1);
            else System.out.print(second+1);
            System.out.println();
        }
    }
}