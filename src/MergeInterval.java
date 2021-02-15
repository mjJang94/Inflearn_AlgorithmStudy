import java.util.ArrayList;
import java.util.List;

public class MergeInterval {


    public static class Interval {
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

        List<Interval> list = merge(intervals);
        print(list);
    }

    private static List<Interval> merge(List<Interval> intervals) {

        if (intervals.isEmpty()) return intervals;

        //1.
        List<Interval> result = new ArrayList<>();
        intervals.sort((o1, o2) -> o1.start - o2.start);

        //2.
        Interval before = intervals.get(0); //[ 1, 3 ]

        for (Interval current : intervals) {

            if (before.end >= current.start) {
                before.end = Math.max(before.end, current.end);
            } else {
                result.add(before);
                before = current;
            }
        }

        if (!result.contains(before)) {
            result.add(before);
        }

        return result;
    }

    private static void print(List<Interval> list) {
        for (Interval in : list) {
            System.out.println(in.start + " " + in.end);
        }
    }
}
