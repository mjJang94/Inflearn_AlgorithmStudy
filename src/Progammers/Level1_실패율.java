package Progammers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Level1_실패율 {

    public static void main(String[] args) {


        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

        System.out.println(Arrays.toString(solution(N, stages)));

    }

    public static int[] solution(int N, int[] stages) {

        //1.
        int[] answer = new int[N];
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;

        //2
        Arrays.sort(stages);

        for (int stage : stages) {

            Set<Integer> keys = map.keySet();

            if (!map.containsKey(stage)) {
                map.put(stage, 1);
            } else {

                for (int key : keys) {

                    if (key == stage) {
                        int count = map.get(key) + 1;
                        map.put(key, count);
                    }
                }
            }
        }

        //3
        for (int key: map.keySet()){

            
        }



        return answer;
    }
}
