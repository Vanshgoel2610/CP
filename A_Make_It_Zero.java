/*   कर्मण्येवाधिकारस्ते मा फलेषु कदाचन। मा कर्मफलहेतुर्भूर्मा ते सङ्गोऽस्त्वकर्माणि॥ 2-47॥   */

import java.util.Scanner;

public class A_Make_It_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* Eg:-
        * Input:-
        * 2
        * 8
        * 3 1 4 1 1 9 2 6
        * 3
        * 100 100 0
        *
        * Solution:-
        * for the first test case, take the xor of all elements (say x) and replace them all by x. Now, as the number of elements are even
        * then the xor of x even number of times is 0.
        * 3^1^4^1^1^9^2^6 = x^x^x^x^x^x^x^x = 0
        *
        * for the second test case, take the xor of all elements (say x) and replace them all by x, Now, from 2 to n take the xor of all elements
        * which will come out as 0 and replace 2 to n elements by 0. Now take the xor of 1 and 2 which will come out as x and replace 1 and 2 by x.
        * Finally, take the xor of 1 and 2 elements which will give 0.
        * 100^100^0 = x^x^x = x^0^0 = x^x^0 = 0
        *
        * */
        int t = sc.nextInt();
        while(t --> 0) {
            int n = sc.nextInt();
            int i = -1;
            while(++i < n) sc.nextInt();
            if(n%2 == 0) {
                System.out.println(2);
                System.out.println("1 " + n);
                System.out.println("1 " + n);
            } else {
                System.out.println(4);
                System.out.println("1 " + n);
                System.out.println("2 " + n);
                System.out.println("1 2");
                System.out.println("1 2");
            }
        }
        sc.close();
    }
}