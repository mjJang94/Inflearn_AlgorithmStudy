package Progammers;

import java.util.*;

public class Level1_나누어_떨어지는_숫자_배열 {

    public static void main(String[] args) {

        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        System.out.println(Arrays.toString(solution(arr, divisor)));
    }

    public static int[] solution(int[] arr, int divisor) {

        //1
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        //2
        for (int tmp : arr){

            if (tmp % divisor == 0){
                stack.add(tmp);
            }
        }

        if (stack.size() == 0){
            stack.add(-1);
        }

        //3
        answer = new int[stack.size()];

        for (int i = 0; i < answer.length; i++){
            answer[i] = stack.get(i);
        }

        //4
        Arrays.sort(answer);


        return answer;
    }
}
