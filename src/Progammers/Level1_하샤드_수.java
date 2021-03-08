package Progammers;

public class Level1_하샤드_수 {

    public static void main(String[] args) {

        int arr = 11;

        System.out.println(solution(arr));

    }

    public static boolean solution(int x) {

        //1
        boolean answer = false;
        String value = String.valueOf(x);
        int[] arr = new int[value.length()];
        int sum = 0;
        int tmp = x;

        //2
        for (int i = 0 ; i < value.length(); i++){
            arr[i] = tmp % 10;
            tmp /= 10;
        }

        //3
        for (int n : arr){
            sum += n;
        }

        //4
        if (x % sum == 0){
            answer = true;
        }



        return answer;
    }

}
