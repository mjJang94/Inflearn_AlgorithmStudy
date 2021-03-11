package Progammers;

import java.util.Arrays;
import java.util.Stack;

public class Level1_예산 {

    public static void main(String[] args) {

        int[] d = {1,3,2,5,4};
        int budget = 9;

        System.out.println(solution(d, budget));
    }

    public static int solution(int[] d, int budget) {

        //1
        int count = 0;
        int sum = 0;
        Arrays.sort(d);

        //2 총합이 예산과 같거나 못 미치는 경우
        for (int value : d) {

            if (sum + value > budget) {
                break;
            }

            sum += value;
            count++;
        }


        return count;
    }
}
