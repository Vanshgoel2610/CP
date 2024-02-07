import java.util.*;
 
public class E_Eating_Queries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            int i = -1;
            while(++i < n) {
                arr.add(0);
                arr.set(i, sc.nextInt());
            }
            Collections.sort(arr, Comparator.reverseOrder());     // because i need the min number of candies
            i = 0;
            while(++i < n) arr.set(i, arr.get(i-1)+arr.get(i));
            while(q --> 0) {
                int query = sc.nextInt();
                int start = 0;
                int end = arr.size()-1;
                int ans = -1;
                while(start <= end) {
                    int mid = start+(end-start)/2;
                    if(arr.get(mid) >= query) {
                        ans = mid+1;
                        end = mid-1;
                    }
                    else if(arr.get(mid) < query) start = mid+1;
                }
                System.out.println(ans);
            }
            arr.clear();
        }
        sc.close();
    }
}