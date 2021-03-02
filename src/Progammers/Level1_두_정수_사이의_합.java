package Progammers;

public class Level1_두_정수_사이의_합 {

    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        System.out.println(solution(a,b));
    }

    public static long solution(int a, int b) {
        long answer = 0;

        if (a > b){

            for (int i = b; i <= a; i++){
                answer += i;
            }
        }

        if (a < b){

            for (int i = a; i <= b; i++){
                answer += i;
            }
        }

        if (a == b){
            answer = a;
        }



        return answer;
    }

}
