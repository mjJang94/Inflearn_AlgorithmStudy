package test;

import java.util.Stack;

public class Level1_crane_test {
    public static void main(String[] args) {

        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};
        //result = 4


        System.out.println(solution(board, moves));
    }


    private static int solution(int[][] board, int[] moves) {
        int answer = 0;

        //1
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        //2
        for (int move : moves) {

            for (int i = 0; i < board.length; i++) {

                int tmp = board[i][move - 1];

                if (tmp != 0) {

                    if (stack.peek() == tmp) {
                        stack.pop();
                        answer += 2;
                    } else {
                        stack.push(tmp);
                    }

                    board[i][move - 1] = 0;
                    break;
                }
            }
        }


        return answer;
    }
}
