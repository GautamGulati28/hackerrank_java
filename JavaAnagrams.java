import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        int a_length = a.length();
        int b_length = b.length();

        if (a_length != b_length) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();
        char temp;

        int[] frequency = new int[26];

        for (int i = 0; i < a_length; i++) {
            temp = a.charAt(i);
            int index = temp - 'a';
            frequency[index]++;
        }

        for (int i = 0; i < b_length; i++) {
            temp = b.charAt(i);
            int index = temp - 'a';
            frequency[index]--;
        }

        for (int i = 0; i < 26; i++) {
            if (frequency[i] != 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}