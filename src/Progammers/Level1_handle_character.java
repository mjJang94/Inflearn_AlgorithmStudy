package Progammers;

public class Level1_handle_character {

    public static void main(String[] args) {
        System.out.println(solution("00bv"));
    }


    public static boolean solution(String s) {

        if (s.length() != 4 && s.length() != 6) return false;

        //1
        boolean answer = true;
        char[] charArray = new char[s.length()];

        //2
        for(int i = 0; i < s.length(); i++){
           charArray[i] = s.charAt(i);
        }

        for (char ch : charArray){

            if (ch >= '0' && ch <= '9'){
                answer = true;
            }else{
                answer = false;
                break;
            }
        }



        return answer;
    }
}
