import java.util.Arrays;

public class MoveZeros {


    /**
     * 문제
     * 배열 num을 감안하여 0이 아닌 요소의 상대적인 순서를 유지하면서 모든 0을 끝으로 이동시키는 함수를 작성해라.
     */

    public static void main(String[] args){
        //1
        int[] nums = {0, 3, 2, 0, 8, 5};
        int index = 0;


        //2
        for (int i =0; i < nums.length; i++){
            if (nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        //3
        while (index < nums.length){
            nums[index] = 0;
            index++;
        }

        //4
        System.out.println(Arrays.toString(nums));

    }
}
