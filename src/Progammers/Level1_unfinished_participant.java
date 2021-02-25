package Progammers;

import java.util.*;

public class Level1_unfinished_participant {

    public static void main(String[] args) {

        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"leo", "kiki"};


        System.out.println(solution(participant, completion));
    }

    private static String solution(String[] participants, String[] completions) {


        //1
        String answer = "";
        int index = 0;


        Arrays.sort(participants);
        Arrays.sort(completions);


        //2
        for (int i = 0; i < completions.length; i++) {

            if (!completions[i].equals(participants[i])) {

                return participants[i];
            }
        }

        return participants[index];

    }
}
