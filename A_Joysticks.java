import java.util.Scanner;
 
public class A_Joysticks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int min = Math.min(a1, a2);
        int max = Math.max(a1, a2);
        int count = 0;
        while (min >= 1 && max > 1 || (min > 1 && max == 1)) {
            int temp;
            int var = Math.max(min, max);
            min = Math.min(min, max);
            max = var;
            temp = (int)(Math.ceil(max/2f))-1;
            if(temp == 0) {
                max = 0;
                min++;
                count++;
            } else {
                min += temp;
                max -= 2*temp;
                count += temp;
            }
        }
        System.out.println(count);
        sc.close();
    }
}