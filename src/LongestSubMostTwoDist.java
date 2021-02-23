import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {

    public static void main(String[] args) {
        String s = "ccaabbb";
        System.out.println(solve(s));
    }

    private static int solve(String s){
        //1
        int start = 0;
        int end = 0;
        int length = 0;
        int counter = 0;

        Map<Character, Integer> map = new HashMap<>();

        //2
        while (end < s.length()) {
            char endChar = s.charAt(end);
            map.put(endChar, map.getOrDefault(endChar, 0) + 1);
            if (map.get(endChar) == 1){
                counter++;
            }
            end++;

            //3
            while (counter > 2){
                char startChar = s.charAt(start);
                map.put(startChar, map.get(startChar) - 1);

                if (map.get(startChar) == 0) counter--;

                start++;
            }
            length = Math.max(length, end - start);
        }
        return length;
    }
}
