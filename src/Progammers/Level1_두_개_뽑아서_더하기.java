package Progammers;

import java.lang.reflect.Array;
import java.util.*;

public class Level1_두_개_뽑아서_더하기 {
    public static void main(String[] args) {

        int[] numbers = {2, 1, 3, 4, 1};


        System.out.println(Arrays.toString(solution(numbers)));
    }


    public static int[] solution(int[] numbers) {

        int[] answer = {};

        //1
        Set<Integer> set = new HashSet<>();
        int index = 0;


        //2

        for (int i = 0 ; i < numbers.length; i++){

            for (int j = i + 1; j < numbers.length; j++){
                int tmp = numbers[i] + numbers[j];

                if (tmp != 0){
                    set.add(tmp);
                }
            }
        }

        //3
        answer = new int[set.size()];

        for (int s : set){
            answer[index] = s;
            index++;
        }

        return answer;
    }

}
