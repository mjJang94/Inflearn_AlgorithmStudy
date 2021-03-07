package Progammers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class Level1_제일_작은_수_제거하기 {
    public static void main(String[] args) {

        int[] arr = {2,4,5,6,1};

        System.out.println(Arrays.toString(solution(arr)));
    }

    public static int[] solution(int[] arr) {

        if (arr.length < 1) return new int[]{-1};

        int min = Arrays.stream(arr).min().getAsInt();

        return Arrays.stream(arr).filter(i -> i != min).toArray();
    }
}
