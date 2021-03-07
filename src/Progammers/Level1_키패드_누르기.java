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
        int leftHandIndex = 0;
        int rightHandIndex = 0;
//        Stack<String> stack = new Stack<>();


        //2
        for (int num: numbers){

            switch (num) {

                //왼쪽 열
                case 1:
                case 4:
                case 7:{
                    leftHandIndex = num;
                    answer.append("L");
                    break;
                }

                //오른쪽 열
                case 3:
                case 6:
                case 9:{
                    rightHandIndex = num;
                    answer.append("R");
                    break;
                }

                //중간 열
                case 2:
                case 5:
                case 8:
                case 0:{

                    if (num + 1 == rightHandIndex && num -1 == leftHandIndex){

                        if (hand.equals("right")){
                            answer.append("R");
                        }else{
                            answer.append("L");
                        }
                    }else{

                        int leftHandDistance = num - leftHandIndex;
                        int rightHandDistance = num - rightHandIndex;

                        if (rightHandDistance > leftHandDistance){
                            answer.append("L");
                        }

                        if (leftHandDistance > rightHandDistance){
                            answer.append("R");
                        }
                    }
                }
            }
        }
        return answer.toString();
    }
}
