/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.*;

public class B_BerSU_Ball {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> boys = new ArrayList<>();
        ArrayList<Integer> girls = new ArrayList<>();
        int n = sc.nextInt();
        int i = -1;
        while(++i < n) boys.add(sc.nextInt());
        Collections.sort(boys);
        int m = sc.nextInt();
        i = -1;
        while(++i < m) girls.add(sc.nextInt());
        int count = 0;
        for(i = 0; i < n; i++) {
            int temp = boys.get(i);
            if(girls.contains(temp-1)) {
                count++;
                girls.remove((Integer)(temp-1));
            } else if(girls.contains(temp)) {
                count++;
                girls.remove((Integer)temp);
            } else if(girls.contains(temp+1)) {
                count++;
                girls.remove((Integer)(temp+1));
            }
        }
        System.out.println(count);
        sc.close();
    }
}