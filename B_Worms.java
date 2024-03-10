/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Scanner;

public class B_Worms {
    public static int binarySearch(ArrayList<Integer> list, int query) {
        int start = 0;
        int end = list.size()-1;
        while(start <= end) {
            int mid = start+(end-start)/2;
            if(list.get(mid) == query) return mid+1;
            else if(list.get(mid) < query) {
                if(list.get(mid+1) > query) return mid+2;
                start = mid+1;
            } else {
                if(mid == 0 || list.get(mid-1) < query) return mid+1;
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        int i = -1;
        while(++i < n) {
            sum += sc.nextInt();
            list.add(sum);
        }
        int m = sc.nextInt();
        i = -1;
        while(++i < m) {
            int query = sc.nextInt();
            System.out.println(binarySearch(list, query));
        }
        sc.close();
    }
}