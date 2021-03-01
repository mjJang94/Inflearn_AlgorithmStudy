package Progammers;

public class Level1_서울에서_김서방_찾기 {

    public static void main(String[] args) {


        String[] input = {"Jane", "Jane", "Jane", "Jane", "Jane", "Jane", "Jane", "Kim"};

        System.out.println(solution(input));
    }

    public static String solution(String[] seoul) {
        StringBuilder stringBuilder = new StringBuilder();
        int position = 0;

        for (int i = 0; i < seoul.length; i++) {

            if (seoul[i].equals("Kim")) {
                position = i;
            }
        }

        stringBuilder.append("김서방은 ").append(position).append("에").append(" 있다");


        return stringBuilder.toString();
    }
}
