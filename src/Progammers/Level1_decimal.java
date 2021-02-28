package Progammers;

public class Level1_decimal {

    public static void main(String[] args) {

        System.out.println(solution(10));
    }


    private static int solution(int n) {
        //1
        int answer = 0;
        boolean[] decimal = new boolean[n + 1];


        //2
        for (int i = 2; i <= n; i++) {
            decimal[i] = true;

        }

        int root = (int) Math.sqrt(n);

        for (int i = 2; i <= root; i++) {
            if (decimal[i]) {
                for (int j = i; i * j <= n; j++) {
                    decimal[i * j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (decimal[i]) {
                answer++;
            }
        }
        return answer;
    }
}

