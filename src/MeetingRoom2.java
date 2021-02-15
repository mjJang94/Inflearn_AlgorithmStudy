import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoom2 {


    public static class Interval {
        int start;
        int end;

        Interval(int s, int e) {
            start = s;
            end = e;
        }
    }


    public static void main(String[] args) {

        Interval in1 = new Interval(5, 10);
        Interval in2 = new Interval(15, 20);
        Interval in3 = new Interval(0, 30);

        Interval[] intervals = {in1, in2, in3};
        System.out.println(solve(intervals));
    }

    private static int solve(Interval[] intervals) {
        if (intervals == null || intervals.length == 0) return 0;

        //1.
        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        Queue<Interval> minHeap = new PriorityQueue<>(intervals.length, (a, b) -> a.end - b.end);
        int max = 0;

        //2.
        for (int i = 0; i < intervals.length; i++){

            while (!minHeap.isEmpty() && minHeap.peek().end <= intervals[i].start){
                minHeap.poll();
            }
            minHeap.offer(intervals[i]); // 0 ~ 30
            max = Math.max(max, minHeap.size());
        }
        return max;
    }
}
