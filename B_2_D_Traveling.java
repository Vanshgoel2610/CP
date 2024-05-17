/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class Ques {
    private static class Two {
        long num1;
        long num2;
        Two(long num1, long num2) {
            this.num1 = num1;
            this.num2 = num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            Two[] arr = new Two[n];
            int i = -1;
            while(++i < n) arr[i] = new Two(sc.nextLong(), sc.nextLong());

            long startMinCost = Long.MAX_VALUE;
            long endMinCost = Long.MAX_VALUE;
            Two startFree;
            Two endFree;
            long ans = Math.abs(arr[a-1].num1-arr[b-1].num1) + Math.abs(arr[a-1].num2-arr[b-1].num2);
            if(k >= 2) {
                startFree = arr[0];
                endFree = arr[k-1];
                i = -1;
                while(++i < k) {
                    Two temp = arr[i];
                    long startCost = Math.abs(arr[a-1].num1-temp.num1) + Math.abs(arr[a-1].num2-temp.num2);
                    long endCost = Math.abs(arr[b-1].num1-temp.num1) + Math.abs(arr[b-1].num2-temp.num2);
                    if(startCost < startMinCost) {
                        startMinCost = startCost;
                        startFree = temp;
                    }
                    if(endCost < endMinCost) {
                        endMinCost = endCost;
                        endFree = temp;
                    }
                }
                ans = Math.min(ans, Math.abs(startFree.num1-arr[a-1].num1)+Math.abs(startFree.num2-arr[a-1].num2)+Math.abs(endFree.num1-arr[b-1].num1)+Math.abs(endFree.num2-arr[b-1].num2));
            }
            System.out.println(ans);
        }
    }
}