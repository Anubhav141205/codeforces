import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.nextLine();
        String host = sc.nextLine();
        String pile = sc.nextLine();

        int[] count = new int[26];

        // Count letters from guest and host
        for (char c : guest.toCharArray()) {
            count[c - 'A']++;
        }

        for (char c : host.toCharArray()) {
            count[c - 'A']++;
        }

        // Remove letters found in the pile
        for (char c : pile.toCharArray()) {
            count[c - 'A']--;
        }

        // Check if all counts are zero
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}