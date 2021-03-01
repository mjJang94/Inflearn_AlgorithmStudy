package Progammers;

import java.util.Arrays;
import java.util.Comparator;

public class Level1_문자열_내_마음대로_정렬하기 {

    public static void main(String[] args) {

//        String[] strings = {"sun", "bed", "car"};
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        System.out.println(Arrays.toString(solution(strings, n)));
    }

    public static String[] solution(String[] strings, int n) {

        //1
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.charAt(n) == b.charAt(n)){
                    return a.compareTo(b);
                }
                return a.charAt(n) - b.charAt(n);
            }
        });

        return strings;
    }
}
