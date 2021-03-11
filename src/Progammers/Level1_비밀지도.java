package Progammers;

import java.util.Arrays;
import java.util.Stack;

public class Level1_비밀지도 {

    public static void main(String[] args) {

        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};

        System.out.println(Arrays.toString(solution(5, arr1, arr2)));

    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {

        //1
        String[] decryption_arr1 = decryption(n, arr1);
        String[] decryption_arr2 = decryption(n, arr2);

        String[] answer = compose(n, decryption_arr1, decryption_arr2);

        //2

        return answer;
    }

    public static String[] compose(int size, String[] arr1, String[] arr2) {

        String[] compose = new String[size];

        for (int i = 0; i < size; i++) {

            StringBuilder stringBuilder = new StringBuilder();
            String a = arr1[i];
            String b = arr2[i];

            for (int j = 0; j < size; j++) {

                if (a.charAt(j) == '#' || b.charAt(j) == '#') {
                    stringBuilder.append("#");
                }else{
                    stringBuilder.append(" ");
                }
            }

            compose[i] = stringBuilder.toString();
        }

        return compose;
    }


    public static String[] decryption(int size, int[] encrpyt) {

        String[] decryption = new String[size];
        int num = 0;
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < size; i++) {

            StringBuilder stringBuilder = new StringBuilder();
            num = encrpyt[i];

            while (num / 2 >= 0) {

                int rest = num % 2;
                num /= 2;
                stack.add(String.valueOf(rest));

                if (stack.size() == size) {
                    break;
                }
            }

            for (int j = 0; j < size; j++) {

                String tmp = stack.pop();

                if (tmp.equals("1")) {
                    stringBuilder.append("#");
                } else {
                    stringBuilder.append(" ");
                }
            }
            decryption[i] = stringBuilder.toString();
        }


        return decryption;
    }
}
