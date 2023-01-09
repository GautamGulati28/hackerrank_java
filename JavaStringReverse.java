import java.util.*;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        String A_rev = "";
        char temp;
        for (int i = 0; i < A.length(); i++) {
            temp = A.charAt(i);
            A_rev = temp + A_rev;
        }
        /* Enter your code here. Print output to STDOUT. */

        if (A.equals(A_rev)) {
            System.out.println("Yes");
        }

        else {
            System.out.println("No");
        }

    }
}
