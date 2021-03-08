package Progammers;

public class Level1_핸드폰_번호_가리기 {

    public static void main(String[] args) {

        String num = "01033334444";

        System.out.println(solution(num));
    }

    public static String solution(String phone_number) {

        //1
        StringBuilder answer = new StringBuilder();
        int lenght = phone_number.length();
        int gap = 0;

        //2

        for (int i = 0; i < lenght - 4; i++){
            answer.append("*");
        }

        answer.append(phone_number, lenght - 4, lenght);


        return answer.toString();
    }

}
