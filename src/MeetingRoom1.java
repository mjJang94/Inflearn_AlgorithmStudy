import java.util.Arrays;
import java.util.Comparator;

public class MeetingRoom1 {

    private static class Interval {
        int start;
        int end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    private static Interval[] given() {

        Interval interval1 = new Interval(30, 0);
        Interval interval2 = new Interval(5, 10);
        Interval interval3 = new Interval(0, 30);

//        Interval interval1 = new Interval(7, 10);
//        Interval interval2 = new Interval(2, 4);

        return new Interval[]{interval1, interval2, interval3};
    }

    public static void main(String[] args) {


        System.out.println(solve(given()));

    }


    private static boolean solve(Interval[] intervals){
        //1. 널체크와 정렬
        if (intervals.length == 0) return false;

        Arrays.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });


        //2. 값 비교하기. 맨 처음 끝나는 시간과 바로 앞시간의 시작시간과 비교
        for (int i = 1; i < intervals.length; i++){

            if (intervals[i-1].end > intervals[i].start){
                return false;
            }
        }

        return true;
    }
}
