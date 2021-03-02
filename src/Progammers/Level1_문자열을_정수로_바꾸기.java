package Progammers;

public class Level1_문자열을_정수로_바꾸기 {

    public static void main(String[] args) {
        String s = "+1234";

        System.out.println(solution(s));
    }


    public static int solution(String s) {

        if (s.startsWith("0")) return 0;

        return Integer.parseInt(s);
    }

}
