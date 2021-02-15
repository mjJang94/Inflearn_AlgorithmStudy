package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MergeInterval_Test {

    static class Interval {
        int start;
        int end;

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }

    public static void main(String[] args) {

        Interval in2 = new Interval(1, 3);
        Interval in1 = new Interval(2, 6);
        Interval in3 = new Interval(8, 10);
        Interval in4 = new Interval(15, 18);

        List<Interval> intervals = new ArrayList<>();
        intervals.add(in1);
        intervals.add(in2);
        intervals.add(in3);
        intervals.add(in4);

        List<Interval> list = solve(intervals);
        print(list);

    }

    private static List<Interval> solve(List<Interval> list){
        //1
        if (list.isEmpty()) return list;

        List<Interval> result = new ArrayList<>(); //결과 반환값 담을 그릇

        Collections.sort(list, (o1, o2) -> o1.start - o2.start);

        //2
        Interval before = list.get(0);

        for (Interval current : list){
            if (before.end >= current.start){
                before.end = Math.max(before.end, current.end);
            }else{
                result.add(before);
                before = current;
            }
        }

        if (!result.contains(before)){
            result.add(before);
        }

        return result;
    }

    private static void print(List<Interval> list){

        for (Interval tmp: list){
            System.out.println(tmp.start + " " + tmp.end);
        }
    }
}
