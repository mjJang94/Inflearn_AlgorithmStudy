package Progammers;

import java.util.Arrays;

public class Level1_numberK {

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
            //copyOfRange (원본 배열, 복사 시작 인덱스 (배열이기 떄문에 -1), 복사 끝 인덱스)
            int[] tmp = Arrays.copyOfRange(array, start - 1, end);

            Arrays.sort(tmp);

            //배열이기 떄문에 또 -1
            answer[i] = tmp[position - 1];
        }

        return answer;
    }
}
