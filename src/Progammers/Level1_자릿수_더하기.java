package Progammers;

public class Level1_자릿수_더하기 {
    public static void main(String[] args) {

        int n = 987;
        System.out.println(solution(n));
    }

    public static int solution(int n) {

        //1
        int answer = 0;
        String tmp = String.valueOf(n);

        //2
        for (int i = 0; i < tmp.length(); i++){
            answer += Integer.parseInt(String.valueOf(tmp.charAt(i)));
        }


        return answer;
    }

}
