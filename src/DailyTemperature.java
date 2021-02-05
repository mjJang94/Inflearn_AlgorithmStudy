import java.util.Stack;

public class DailyTemperature {

    public static void main(String[] args) {

        int[] nums = {73, 74, 75, 71, 69, 72, 76, 73};

        StringBuffer stringBuffer = new StringBuffer();

        for (int s : dailyTemperatures((nums))){
            stringBuffer.append(s).append(' ');
        }

        System.out.println(stringBuffer.toString());

    }

    private static int[] dailyTemperatures(int[] nums) {

        //1
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];


        //2
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {

                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }


        return result;
    }
}
