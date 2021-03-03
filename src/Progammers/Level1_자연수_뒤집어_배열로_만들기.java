package Progammers;

import java.util.*;

public class Level1_자연수_뒤집어_배열로_만들기 {

    public static void main(String[] args) {
        long n = 1999399339L;

        System.out.println(Arrays.toString(solution(n)));
    }

    public static int[] solution(long n) {
        //1
        int[] answer = {};
        List<Integer> list = new ArrayList<>();


        //2
        while (n > 0) {
            long d = n % 10;
            n = n / 10;
            list.add((int) d);
        }

        //3
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
