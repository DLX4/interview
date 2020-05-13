import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Maxtrix {

    /**
     * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.
     *
     * Note: You can only move either down or right at any point in time.
     *
     * Example:
     *
     * Input:
     * [
     *   [1,3,1],
     *   [1,5,1],
     *   [4,2,1]
     * ]
     * Output: 7
     * Explanation: Because the path 1→3→1→1→1 minimizes the sum.
     *
     *
     * non-negative numbers
     * top left to bottom right
     * move either down or right
     * minimizes the sum.
     *
     * 思路1：对于输入in[i,j]的解等于  in[i, j-1]的解  in[i-1,j]的解 两者的较小值 + (i,j)
     * 优化思路：in[i, j-1]的解  in[i-1,j]的解 有重复求解
     *
     * */
    public static void main(String[] args) {

        int[][] in = {
                {3,8,6,0,5,9,9,6,3,4,0,5,7,3,9,3},
                {0,9,2,5,5,4,9,1,4,6,9,5,6,7,3,2},
                {8,2,2,3,3,3,1,6,9,1,1,6,6,2,1,9},
                {1,3,6,9,9,5,0,3,4,9,1,0,9,6,2,7},
                {8,6,2,2,1,3,0,0,7,2,7,5,4,8,4,8},
                {4,1,9,5,8,9,9,2,0,2,5,1,8,7,0,9},
                {6,2,1,7,8,1,8,5,5,7,0,2,5,7,2,1},
                {8,1,7,6,2,8,1,2,2,6,4,0,5,4,1,3},
                {9,2,1,7,6,1,4,3,8,6,5,5,3,9,7,3},
                {0,6,0,2,4,3,7,6,1,3,8,6,9,0,0,8},
                {4,3,7,2,4,3,6,4,0,3,9,5,3,6,9,3},
                {2,1,8,8,4,5,6,5,8,7,3,7,7,5,8,3},
                {0,7,6,6,1,2,0,3,5,0,8,0,8,7,4,3},
                {0,4,3,4,9,0,1,9,7,7,8,6,4,6,9,5},
                {6,5,1,9,9,2,2,7,4,2,7,2,2,3,7,2},
                {7,1,9,6,1,2,7,0,9,6,6,4,4,5,1,0},
                {3,4,9,2,8,3,1,2,6,9,7,0,2,4,2,0},
                {5,1,8,8,4,6,8,5,2,4,1,6,2,2,9,7}
        };

        // System.out.println(solution(in, in.length -1, in[0].length -1));
        System.out.println(solution(in));
        Objects.equals(1, 1);

    }


    /**
     * 返回最小路径和
     * @param in
     * @return
     */
    private static int solution(int[][] in) {
        int[][] cache = new int[in.length][in[0].length];
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[0].length; j++) {
                cache[i][j] = -1;
            }
        }
        return solution(in, in.length -1, in[0].length -1, cache);
    }

    /**
     * 返回最小路径和
     * @param in 输入矩阵
     * @param r 矩阵的行数 0~size-1
     * @param c 矩阵的列数 0~size-1
     * @return
     */
    private static int solution(int[][] in, int r, int c, int[][] cache) {
        int res = 0;

        if (cache[r][c] != -1) {
            return cache[r][c];
        }

        if (r == 0 && c ==0) {
            res = in[0][0];
            // return res;
        } else if (r == 0) {
            res = solution(in, r, c-1, cache) + in[r][c];
        } else if (c == 0) {
            res = solution(in, r-1, c, cache) + in[r][c];
        } else {
            int path1 = solution(in, r, c-1, cache);
            int path2 = solution(in, r-1, c, cache);

            res = Integer.min(path1, path2) +  in[r][c];
        }
        cache[r][c] = res;
        return res;
    }
}
