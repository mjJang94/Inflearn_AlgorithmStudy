package test;

import java.util.Stack;

public class DailyTemperature_Test {



    public static void main(String[] args) {

        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};

        StringBuffer stringBuffer = new StringBuffer();

        for (int value: temp(nums)){
            stringBuffer.append(value).append(' ');
        }

        System.out.println(stringBuffer.toString());
    }

    private static int[] temp(int[] tmps){

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[tmps.length];

        for (int i = 0; i < tmps.length; i++){

            while (!stack.isEmpty() && tmps[stack.peek()] < tmps[i]){

                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }
}
