package Progammers;

import java.util.Arrays;
import java.util.Comparator;

public class Level1_문자열_내림차순으로_배치하기 {

    public static void main(String[] args) {

        String s = "Zbcdefg";
        System.out.println(solution(s));
    }


    public static String solution(String s) {

        //1
        if (s.length() < 1) return "";

        StringBuffer stringBuffer = new StringBuffer();
        String[] chars = new String[s.length()];


        //2
        for (int i = 0; i < s.length(); i++){
            chars[i] = String.valueOf(s.charAt(i));
        }

        Arrays.sort(chars, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.charAt(0) - o1.charAt(0);
            }
        });



        //3
        for (String c : chars){
            stringBuffer.append(c);
        }


        return stringBuffer.toString();
    }
}
