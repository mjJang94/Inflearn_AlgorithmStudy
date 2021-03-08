package Progammers;

public class Level_1_평균_구하기 {

    public static void main(String[] args) {

        int[] arr = {5, 5};

        System.out.println(solution(arr));
    }

    public static double solution(int[] arr) {

        double answer = 0;

        for (int tmp : arr){
            answer += tmp;
        }



        return answer/arr.length;
    }

}
