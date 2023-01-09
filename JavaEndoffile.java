import java.util.*;

public class JavaEndoffile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while (sc.hasNext()) {

            String str = sc.nextLine();
            System.out.println(i + " " + str);
            i = i + 1;
            if (str.length() > 12) {
                String str2 = str.substring((str.length() - 12));
                if (str2 == "end-of-file.") {
                    break;
                }
            }
        }
        sc.close();
    }
}
