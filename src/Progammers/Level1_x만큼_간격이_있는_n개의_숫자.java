package Progammers;

import java.util.Arrays;

public class Level1_x만큼_간격이_있는_n개의_숫자 {

    public static void main(String[] args) {
        int x = 10000000;
        int n = 1000;

        System.out.println(Arrays.toString(solution(x, n)));
    }

    public static long[] solution(long x, long n) {
        long[] answer = new long[(int) n];
        long tmp = x;


        for (int i = 0; i < n; i++){
            answer[i] = tmp;

            tmp += x;
        }


        return answer;
    }
}
