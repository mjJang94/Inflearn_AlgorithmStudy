package Progammers;

public class Level1_체육복 {


    public static void main(String[] args) {

//        int n = 5;
        int n = 3;
//        int[] lost = {2,4};
        int[] lost = {3};
//        int[] reserve = {1,3,5};
        int[] reserve = {1};

        System.out.println(solution(n, lost, reserve));

    }

    private static int solution(int n, int[] lost, int[] reserve) {
        //1
        int answer = n - lost.length;

        //2 여벌옷이 있는사람들중 도난당한사람 거르기
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {


                if (lost[i] == reserve[j]) {
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }

            }
        }

        //3 여벌옷도 없고 도난도 당했지만 구제될수 있는사람 고르기
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {

                if (lost[i] == reserve[j] -1 || lost[i] == reserve[j] +1){
                    answer++;
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }


        return answer;
    }
}
