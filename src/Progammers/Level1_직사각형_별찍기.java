package Progammers;

import java.util.Scanner;

public class Level1_직사각형_별찍기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(solution(a, b));
    }

    public static String solution(int a, int b){

        //1
        StringBuilder stringBuilder = new StringBuilder();


        //2
        for (int i = 0; i < b; i++){

            for (int j = 0; j < a; j++){
                stringBuilder.append('*');
            }

            stringBuilder.append('\n');
        }

        return stringBuilder.toString();
    }
}
