package test;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones_Test {

    public static void main(String[] args) {
        String J = "aA", S = "aAAbbbb";

        System.out.println(solve(J, S));
    }

    private static int solve(String J, String S) {

        int count = 0;
        Set<Character> set = new HashSet<>();

        for (char jewel : J.toCharArray()){
            set.add(jewel);
        }

        for (char stone : S.toCharArray()){

            if (set.contains(stone)){
                count++;
            }
        }

        return count;
    }
}
