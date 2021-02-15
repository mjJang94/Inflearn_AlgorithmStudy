package test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MeetingRoom2_Test {

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

    private static int solve(Interval[] intervals){

        if (intervals == null || intervals.length == 0) return 0;


        //Start time 으로 오름차순 정렬
        Arrays.sort(intervals, (a, b) -> a.start - b.start);

        //End time 으로 소팅하면서 PriorityQueue 에 값 넣기, 값이 들어갈때마다 end 기준으로 오름차순으로 정렬됨
        Queue<Interval> minHeap = new PriorityQueue<>(intervals.length, (a, b) -> a.end - b.end);

        //리턴할 값 정의
        int max = 0;

        for (int i = 0 ; i < intervals.length; i++){

            //intervals[i].start (Current.start)
            //minHeap.peek().end (Before.end)
            while (!minHeap.isEmpty() &&  minHeap.peek().end <= intervals[i].start){

                minHeap.poll();
            }
            minHeap.offer(intervals[i]);
            max = Math.max(max, minHeap.size());
        }

        return max;
    }
}
