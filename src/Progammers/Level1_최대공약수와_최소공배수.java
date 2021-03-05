package Progammers;

import java.util.Arrays;

public class Level1_최대공약수와_최소공배수 {

    public static void main(String[] args) {

        int n = 24;
        int m = 36;

        System.out.println(Arrays.toString(solution(n, m)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = {};

        //최대공약수
        int common_measure = n;
        //최소공배수
        int common_multiple = 0;


        //최대 공약수 구하기
        while (common_measure > 0) {

            if (n % common_measure == 0 && m % common_measure == 0) {
                break;
            }

            --common_measure;
        }

        //최소공배수 구하기
        common_multiple += (n / common_measure) * (m / common_measure);

        common_multiple *= common_measure;


        return new int[]{common_measure, common_multiple};
    }
}
