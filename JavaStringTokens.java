
import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = sc.nextLine().split("[ \"!,?._'@\". ]");
        int size = a.length;
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo("") == 0) {
                size = size - 1;
            }

        }
        System.out.println(size);
        for (int i = 0; i < a.length; i++) {
            if (a[i].compareTo("") != 0) {
                System.out.println(a[i]);

            }
        }
        sc.close();

    }
}
