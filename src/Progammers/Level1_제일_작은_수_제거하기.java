package Progammers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Level1_제일_작은_수_제거하기 {
    public static void main(String[] args) {

        int[] arr = {2,4,5,6,1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();

        Arrays.sort(arr);

        int bigger = arr[0];

        for (int value : arr){

            if (value > bigger){
                stack.add(value);
                bigger = value;
            }
        }

        answer = new int[stack.size()];

        for (int i = 0; i < answer.length; i++){
            answer[i] = stack.pop();
        }

        return answer;
    }
}
