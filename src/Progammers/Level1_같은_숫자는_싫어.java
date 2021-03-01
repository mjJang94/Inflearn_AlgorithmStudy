package Progammers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Level1_같은_숫자는_싫어 {

    public static void main(String[] args) {

        int[] arr = {4,4,4,3,3};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        //1
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        stack.add(arr[0]);

        //2
        for (int i = 1; i < arr.length; i++){
            if (stack.peek() != arr[i]){
                stack.add(arr[i]);
            }
        }

        //3
        answer = new int[stack.size()];

        for (int i = 0 ; i < answer.length; i++){
            answer[i] = stack.get(i);
        }

        return answer;
    }

}
