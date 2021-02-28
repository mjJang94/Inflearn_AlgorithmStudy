package Progammers;

public class Level1_watermelon {

    public static void main(String[] args) {

        System.out.println(solution(17));
    }

    private static String solution(int n){

        //1
        StringBuilder stringBuilder = new StringBuilder();
        boolean checker = true;

        //2
        for (int i = 0; i < n; i++){

            if (checker){
                stringBuilder.append("수");
                checker = false;
            }else{
                stringBuilder.append("박");
                checker = true;
            }
        }


        return stringBuilder.toString();
    }
}
