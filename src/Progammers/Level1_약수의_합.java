package Progammers;

import java.util.Stack;

public class Level1_약수의_합 {

    public static void main(String[] args) {
        int n = 12;

        System.out.println(solution(n));
    }

    public static int solution(int n) {

        //1
        int answer = 0;
        Stack<Integer> stack = new Stack<>();


        //2
        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                stack.add(i);
            }
        }


        //3
        while (!stack.isEmpty()){
            answer += stack.pop();
        }

        return answer;
    }
}
