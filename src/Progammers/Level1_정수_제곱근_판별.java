package Progammers;

public class Level1_정수_제곱근_판별 {

    public static void main(String[] args) {
        long n = 3;
        System.out.println(solution(n));
    }

    public static long solution(long n) {
        long answer = 0;

        long s = (long) Math.sqrt(n);

        if (s * s == n){
            s += 1;
            answer = s * s;
        }else{
            answer = -1;
        }


        return answer;
    }
}
