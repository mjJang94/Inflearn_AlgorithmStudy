import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom1_Test {

    private static class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void main(String[] args) {

        Interval inter3 = new Interval(3, 30);
        Interval inter1 = new Interval(15, 20);
        Interval inter2 = new Interval(5, 10);

        Interval[] intervals = {inter1, inter2, inter3};

        System.out.println(solve(intervals));
    }

    private static boolean solve(Interval[] intervals) {

        //1 널체크
        if (intervals.length == 0) return false;

        //2 내림차순 소팅 (큰수 -> 작은수)
        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        //3.값비교
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i - 1].end > intervals[i].start) {
                return false;
            }
        }

        return true;
    }


}