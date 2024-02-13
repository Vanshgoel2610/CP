import java.util.*;

public class F_Eating_Candies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            int i = -1;
            while(++i < n) list.add(sc.nextInt());
            int first, second;
            long firstSum, secondSum;
            if(n != 1) {
                first = 0;
                second = n-1;
                firstSum = list.getFirst();
                secondSum = list.get(n-1);
            } else {
                System.out.println("0");
                continue;
            }

            int ans = 0;
            while(first < second) {
                if(firstSum < secondSum && first+1 < second) {
                    first++;
                    firstSum += list.get(first);
                } else if(firstSum > secondSum && second-1 > first) {
                    second--;
                    secondSum += list.get(second);
                } else if(firstSum == secondSum) {
                    int temp = first+1+n-second;
                    if(temp == ans) break;
                    ans = temp;
                    if(first+1 != second) {
                        first++;
                        firstSum += list.get(first);
                    }
                    if(second-1 != first) {
                        second--;
                        secondSum += list.get(second);
                    }
                } else break;
            }
            if(firstSum == secondSum) ans = first+1+n-second;
            System.out.println(ans);
        }
        sc.close();
    }
}