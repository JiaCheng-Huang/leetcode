package java;

/**
 * @author Jiacheng Huang
 * @date 2019/03/01 02:17
 */
public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] horizontal = new int[grid.length];
        int[] vertical = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            int maxHeight = 0;
            for (int j = 0; j < grid[i].length; j++) {
                if (maxHeight < grid[i][j]) {
                    maxHeight = grid[i][j];
                }
            }
            horizontal[i] = maxHeight;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int maxHeight = 0;
            for (int j = 0; j < grid.length; j++) {
                if (maxHeight < grid[j][i]) {
                    maxHeight = grid[j][i];
                }
            }
            vertical[i] = maxHeight;
        }
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == horizontal[i] || grid[i][j] == vertical[j]) {
                    continue;
                }
                if (horizontal[i] < vertical[j]) {
                    result += horizontal[i] - grid[i][j];
                    grid[i][j] = horizontal[i];
                } else {
                    result += vertical[j] - grid[i][j];
                    grid[i][j] = vertical[j];
                }
            }
        }
        return result;
    }
}