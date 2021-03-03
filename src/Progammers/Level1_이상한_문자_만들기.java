package Progammers;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Level1_이상한_문자_만들기 {

    public static void main(String[] args) {

        String s = "try hello world";

        System.out.println(solution(s));
    }

    public static String solution(String s) {
        //1
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;

        //2
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == ' ') {
                stringBuilder.append(' ');
                index = 0;
            } else {

                if (index % 2 == 0) {
                    stringBuilder.append(Character.toUpperCase(s.charAt(i)));
                    index++;
                } else {
                    stringBuilder.append(Character.toLowerCase(s.charAt(i)));
                    index++;
                }
            }
        }


        return stringBuilder.toString();
    }
}
