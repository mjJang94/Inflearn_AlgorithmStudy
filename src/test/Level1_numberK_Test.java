package test;

import java.util.Arrays;

public class Level1_numberK_Test {

    public static void main(String[] args) {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        System.out.println(Arrays.toString(solution(array, commands)));
    }

    static int[] solution(int[] array, int[][] commands) {
        //1.
        int[] answer = new int[commands.length];


        //2.
        for (int i = 0; i < commands.length; i++){

            int start = commands[i][0];
            int end = commands[i][1];
            int position = commands[i][2];

            int[] tmp = Arrays.copyOfRange(array, start - 1, end);
            Arrays.sort(tmp);

            answer[i] = tmp[position - 1];
        }

        return answer;
    }
}
