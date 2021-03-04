package Progammers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Level1_정수_내림차순으로_배치하기 {

    public static void main(String[] args) {

        long n = 118372;

        System.out.println(solution(n));
    }



    public static long solution(long n){
        long answer = 0;
        String tmp = String.valueOf(n);
        StringBuilder sum = new StringBuilder();
        Character[] chars = new Character[tmp.length()];


        for (int i = 0; i < tmp.length(); i++){
            chars[i] = tmp.charAt(i);
        }

        Arrays.sort(chars, new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < chars.length; i++){
            sum.append(chars[i]);
        }

        answer = Long.parseLong(sum.toString());
        return answer;
    }
}
