package Progammers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Level1_Exam {

    public static void main(String[] args) {

        int[] answers = {1,3,2,4,2};

        System.out.println(Arrays.toString(solution(answers)));
    }

    private static int[] solution(int[] answers) {

        List<Integer> list = new ArrayList<>();

        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int firstCount = answerCount(answers, first);
        int secondCount = answerCount(answers, second);
        int thirdCount = answerCount(answers, third);

        int maxValue = Math.max(firstCount, Math.max(secondCount, thirdCount));


        if (maxValue == firstCount){
            list.add(1);
        }
        if (maxValue == secondCount){
            list.add(2);
        }
        if (maxValue == thirdCount){
            list.add(3);
        }

        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            result[i] = list.get(i);
        }

        return result;
    }

    private static int answerCount(int[] answers, int[] student){


        int count = 0;


        for (int i = 0; i < answers.length; i++){

            int tmpAnswer = answers[i];
            int tmpStudent = student[i];

            if (tmpAnswer == tmpStudent){
                count++;
            }
        }


        return count;
    }
}
