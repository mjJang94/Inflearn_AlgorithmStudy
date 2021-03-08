package Progammers;

import java.util.Stack;

public class Level1_키패드_누르기 {

    public static void main(String[] args) {

        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        String outPut = "LRLLLRLLRRL";
        System.out.println(solution(numbers, hand));
    }

    public static String solution(int[] numbers, String hand) {

        //1
        StringBuilder answer = new StringBuilder();
        int leftHandIndex = 10;
        int rightHandIndex = 12;


        //2
        for (int num : numbers) {

            switch (num) {

                //왼쪽 열
                case 1:
                case 4:
                case 7: {
                    leftHandIndex = num;
                    answer.append("L");
                    break;
                }

                //오른쪽 열
                case 3:
                case 6:
                case 9: {
                    rightHandIndex = num;
                    answer.append("R");
                    break;
                }

                //중간 열
                case 2:
                case 5:
                case 8:
                case 0: {

                    int leftHandDistance = getLength(leftHandIndex, num);
                    int rightHandDistance = getLength(rightHandIndex, num);

                    if (leftHandDistance > rightHandDistance){

                        rightHandIndex = num;
                        answer.append("R");
                    }else if (leftHandDistance < rightHandDistance){

                        leftHandIndex = num;
                        answer.append("L");
                    }else{

                        if (hand.equals("right")){
                            rightHandIndex = num;
                            answer.append("R");
                        }else{
                            leftHandIndex = num;
                            answer.append("L");
                        }
                    }

                    break;
                }
            }
        }
        return answer.toString();
    }

    public static int getLength(int index, int num) {

        index = (index == 0) ? 11 : index;
        num = (num == 0) ? 11 : num;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;

        int numberX = num /3;
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}
