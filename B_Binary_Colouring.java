/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.ArrayList;
import java.util.Scanner;

public class B_Binary_Colouring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0) {
            int x = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            String temp = "";
            while(x > 0) {
                if((x&1) == 0) {
                    if(temp.length() == 1) {
                        list.add(Integer.parseInt(temp));
                        list.add(0);
                        temp = "";
                    } else if(temp.length() > 1){
                        list.add(-1);
                        int j = 0;
                        while(++j < temp.length()) list.add(0);
                        temp = "1";
                    } else {
                        list.add(0);
                        temp = "";
                    }
                } else temp = temp.concat("1");
                x >>= 1;
            }
            if(temp.length() == 1) list.add(Integer.parseInt(temp));
            else if(temp.length() > 1){
                list.add(-1);
                int j = 0;
                while(++j < temp.length()) list.add(0);
                list.add(1);
            }
            System.out.println(list.size());
            int i = -1;
            while(++i < list.size()) System.out.print(list.get(i) + " ");
            System.out.println();
        }
        sc.close();
    }
}