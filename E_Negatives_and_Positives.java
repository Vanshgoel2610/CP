import java.util.*;

public class E_Negatives_and_Positives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int i = -1;
            long sum = 0;
            int count = 0;
            while(++i < n) {
                int temp = sc.nextInt();
                arr[i] = temp;
                sum += temp;
                if(temp < 0) count++;
            }
            Arrays.sort(arr);
            boolean even = count%2 == 0;
            i = -1;
            if(even) {
                while(++i < count) {
                    sum += -(arr[i]*2);
                }
            } else {
                if(count < n && arr[count] < Math.abs(arr[0])) {
                    // arr[count] = -arr[count];
                    // arr[0] = -arr[0];
                    sum -= 2*arr[count];
                    // Arrays.sort(arr);
                    // if(count < n && arr[count] < Math.abs(arr[0])) i = count-1;
                    if(count-1 != 0) i = count-1;
                }
                else if(Math.abs(arr[count-1]) <= Math.abs(arr[0])) i = count-1;           // Wrong
                int j = -1;
                while(++j < count) {
                    if(j != i) sum += -(arr[j]*2);
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}