import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class KClosest {


    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int k = 1;

        int[][] result = solve(points, k);

        print(result);
    }

    private static int[][] solve(int[][] points, int k) {
        Queue<int[]> queue = new PriorityQueue<>(points.length, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (a[0] * a[0] + a[1] * a[1]) - (b[0] * b[0] + b[1] * b[1]);
            }
        });


        int[][] result = new int[k][2];
        int index = 0;

        for (int[] p : points) {
            queue.offer(p);
        }

        while (index < k) {
            result[index] = queue.poll();
            index++;
        }
        return result;
    }

    private static void print(int[][] tmp){

        for (int i = 0; i < tmp.length; i++){
            for (int j =0; j < tmp[i].length; j++ ){
                System.out.println(tmp[i][j]);
            }
            System.out.println();
        }
    }
}
