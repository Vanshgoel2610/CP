import java.util.Scanner;

public class A_Parallelepiped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int face1 = sc.nextInt();
        int face2 = sc.nextInt();
        int face3 = sc.nextInt();
        float h = (float)Math.sqrt(face1*face2/face3*1.0);
        float l = (float)Math.sqrt(face2*face3/face1*1.0);
        float b = (float)Math.sqrt(face1*face3/face2*1.0);
        System.out.println((int)(4*(l+b+h)));
        sc.close();


        /* bh = a1
         * hl = a2
         * lb = a3
         * Make 1st equation b/l = a1/a2
         * Make 2nd equation h/b = a2/a3
         * Make 3rd equation h/l = a1/a3
         * h^2/(lb) = a1*a2/(a3)^2
         * h^2 = a1*a2/a3
         * l^2 = a2*a3/a1
         * b^2 = a1*a3/a2
         * 
         * Now the perimeter can be found out easily.
         */
    }
}