import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";

        System.out.println(solve(J, S));
    }

    private static int solve(String J, String S) {

        Set<Character> set = new HashSet<>();

        for (char jew : J.toCharArray()) {

            set.add(jew); // a, A
        }

        int count = 0;

        for (char stone : S.toCharArray()) {

            if (set.contains(stone)) {
                count++;
            }
        }
        return count;
    }
}
