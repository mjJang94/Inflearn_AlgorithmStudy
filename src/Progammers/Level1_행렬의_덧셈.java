package Progammers;

import java.util.Arrays;

public class Level1_행렬의_덧셈 {

    public static void main(String[] args) {

        int[][] arr1 = {{1}, {2}};
        int[][] arr2 = {{3}, {4}};


        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {

        //1
        int[][] answer = new int[arr1.length][arr1[0].length];


        //2
        for (int i = 0; i < arr1.length; i++) {


            for (int j = 0; j < arr1[1].length; j++) {
                int a = arr1[i][j];
                int b = arr2[i][j];

                answer[i][j] = a + b;
            }
        }


        return answer;
    }
}
