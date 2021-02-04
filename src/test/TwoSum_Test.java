package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Test {

    public static void main(String[] args) {
        int[] nums = {2, 10, 0, 8};
        int target = 10;

        System.out.println(Arrays.toString(solve(nums, target)));
    }

    static int[] solve(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];


        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int value = map.get(nums[i]);
                result[0] = value + 1;
                result[1] = i + 1;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
