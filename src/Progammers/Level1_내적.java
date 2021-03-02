package Progammers;

public class Level1_내적 {

    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};

        System.out.println(solution(a, b));
    }

    public static int solution(int[] a, int[] b) {

        //1
        int answer = 0;

        //2
        for (int i = 0; i < a.length; i++) {

            for (int j = i; j <= i; j++) {
                answer += a[i] * b[j];
            }
        }


        return answer;
    }
}
