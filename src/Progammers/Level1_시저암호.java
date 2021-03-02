package Progammers;

public class Level1_시저암호 {

    public static void main(String[] args) {
        String S = "z";
        int n = 1;

        System.out.println(solution(S, n));
    }

    public static String solution(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {


            char tmp = s.charAt(i);

            if (tmp != ' ') {


                //소문자
                if ('a' <= tmp && tmp <= 'z') {

                    tmp += n;

                    //소문자 z 넘길 경우
                    if (tmp > 'z') {

                        tmp -= 26;
                    }
                }

                //대문자
                if ('A' <= tmp && tmp <= 'Z') {

                    tmp += n;
                    //대문자 Z 넘길 경우
                    if (tmp > 'Z') {

                        tmp -= 26;
                    }
                }
            }

            stringBuilder.append(tmp);
        }

        return stringBuilder.toString();
    }
}
