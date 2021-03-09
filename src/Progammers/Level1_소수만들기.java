package Progammers;

import java.util.Stack;

public class Level1_소수만들기 {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4};

        System.out.println(solution(nums));

    }

    public static int solution(int[] nums) {

        //1
        int answer = 0;
        int size = 0;


        //2
        for (int i = 0; i < nums.length; i++){

            for (int j = i + 1; j < nums.length; j++){

                for (int k = j + 1; k < nums.length; k++){

                    int sum = nums[i] + nums[j] + nums[k];

                    if (isPrime(sum)){
                        answer++;
                    }
                }
            }
        }


        return answer;
    }

    /**
     * 소수 판별식
     */
    public static boolean isPrime(int num){

        for (int i = 2; i * i <= num; i++){
            if (num % i == 0) return false;
        }

        return true;
    }
}
