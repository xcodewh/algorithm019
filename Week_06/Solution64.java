/**
 * 
 * [64] Minimum Path Sum
 */
class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length; // number of rows
        int m = grid[0].length; // number of columns
        
        for (int i = m - 2;i >= 0;i--) {
            grid[n - 1][i] = grid[n - 1][i] + grid[n - 1][i + 1];
        }
        
        for (int j = n - 2;j >= 0;j--) {
            grid[j][m - 1] = grid[j][m - 1] + grid[j + 1][m - 1];
        }
        
        for (int i = m - 2;i >= 0;i--) {
            
            for (int j = n - 2;j >= 0;j--) {
                grid[j][i] = Math.min(grid[j + 1][i], grid[j][i + 1]) + grid[j][i];
            }
        }
        return grid[0][0];
    }
}