package Progammers;

import java.util.Stack;

public class Level1_문자열_내_p와_y의_개수 {


    public static void main(String[] args) {

        String s = "Pyy";

        System.out.println(solution(s));
    }

    public static boolean solution(String s) {

        //1
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        int p_counter = 0;
        int y_counter = 0;


        //2
        for (int i = 0; i < s.length(); i++){
            stack.add(s.charAt(i));
        }

        //3
        while (!stack.isEmpty()){

            char tmp = stack.pop();

            if (tmp == 'p' || tmp == 'P'){
                ++p_counter;
            }

            if (tmp == 'y' || tmp == 'Y'){
                ++y_counter;
            }
        }


        //4
        answer = p_counter == y_counter;

        return answer;
    }
}
