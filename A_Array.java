import java.util.ArrayList;
import java.util.Scanner;

public class A_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        int i = -1;
        while(++i < n) {
            int temp = sc.nextInt();
            if(temp < 0) list1.add(temp);
            else if(temp > 0) list2.add(temp);
            else list3.add(temp);
        }

        if(list2.isEmpty()) {
            list2.add(list1.removeFirst());
            list2.add(list1.removeFirst());
        }

        if(list1.size()%2 == 0) {
            list3.add(list1.removeFirst());
        }
        
        i = -1;
        System.out.print(list1.size() + " ");
        while(++i < list1.size()) System.out.print(list1.get(i) + " ");
        System.out.println();
        System.out.print(list2.size() + " ");
        i = -1;
        while(++i < list2.size()) System.out.print(list2.get(i) + " ");
        System.out.println();
        System.out.print(list3.size() + " ");
        i = -1;
        while(++i < list3.size()) System.out.print(list3.get(i) + " ");
        System.out.println();
        sc.close();
    }
}