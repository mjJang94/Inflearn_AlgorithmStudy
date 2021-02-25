package Progammers;

public class Level1_newid_recommand {


    public static void main(String[] args) {

        String new_id = "abcdefghijklmn.p";

        System.out.println(solution(new_id));

    }

    private static String solution(String id) {

        String new_id = "";

        //1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
        id = id.toLowerCase();

        // 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        for (int i = 0; i < id.length(); i++) {

            char tmp = id.charAt(i);

            if (tmp >= 'a' && tmp <= 'z') {
                new_id += String.valueOf(tmp);

            } else if (tmp >= '0' && tmp <= '9') {
                new_id += String.valueOf(tmp);

            } else if (tmp == '-' || tmp == '_' || tmp == '.') {
                new_id += String.valueOf(tmp);
            }
        }

        // 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        for (int i = 0; i < new_id.length(); i++) {

            if (new_id.charAt(i) == '.') {

                int j = i + 1;

                String dot = ".";


                while (j != new_id.length() && new_id.charAt(j) == '.'){
                    dot += ".";
                    j++;
                }

                if (dot.length() > 1){
                    new_id = new_id.replace(dot, ".");
                }
            }
        }

        // 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        if(new_id.startsWith(".")){
            new_id  = new_id.substring(1, new_id.length());
        }
        if (new_id.endsWith(".")){
            new_id = new_id.substring(0, new_id.length() - 1);
        }

        // 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (new_id.length() == 0){
            new_id = "a";
        }

        // 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
        // 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (new_id.length() >= 16){
            new_id = new_id.substring(0, 15);

            if (new_id.endsWith(".")){
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        // 7단계 아이디의 길이가 2자 이하가 아니므로 변화가 없습니다.
        if (new_id.length() <= 2){

            String tmp = String.valueOf(new_id.charAt(new_id.length() - 1));

            while (new_id.length() < 3){
                new_id += tmp;
            }
        }

        return new_id;
    }
}
