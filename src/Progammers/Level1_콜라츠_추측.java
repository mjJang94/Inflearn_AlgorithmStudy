package Progammers;

public class Level1_콜라츠_추측 {

    public static void main(String[] args) {

        int n = 626331;

        System.out.println(solution(n));
    }

    public static int solution(long num) {

        int count = 0;


        while (num != 1) {

            if (num % 2 == 0) {
                num /= 2;
            } else {
                num = (num * 3) + 1;
            }

            ++count;


            if (count == 500) {
                count = -1;
                break;
            }
        }


        return count;
    }
}
