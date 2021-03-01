package Progammers;

public class Level1_가운데_글자_가져오기 {

    public static void main(String[] args) {

//        String input = "abcde";
        String input = "qwer";

        System.out.println(solution(input));
    }

    public static String solution(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        //1
        int index = Math.round(s.length() / 2);

        //2
        //짝수
        if (s.length() % 2 == 0 ){
            stringBuilder.append(s.charAt(index - 1)).append(s.charAt(index));


            //홀수
        }else{
            stringBuilder.append(s.charAt(index));
        }

        return stringBuilder.toString();
    }
}
