import java.util.*;

import java.lang.Math;

public class JavaLoopsII {
    public static void main(String[] argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int numberOfTerms = in.nextInt();
            int result = 0;

            for (int j = 0; j < numberOfTerms; j++) {
                result = result + (int) (Math.pow(2, j) * b);
                System.out.print(a + (result) + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
