/**
 * 
 * [200] Number of Islands
 */

class Solution {
    int[][] dirs = new int[][] {{1,0},{0,1},{-1,0},{0,-1}};
    public int numIslands(char[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        int res = 0;
        for (int i = 0;i < grid.length;i++) {
            for (int j = 0;j < grid[0].length;j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    res++;
                    dfs(grid, i, j, visited);
                }
            }
        }
        return res;
    }
    
    private void dfs(char[][] grid, int x, int y, boolean[][] visited) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == '0' || visited[x][y]) {
            return;
        }
        
        visited[x][y] = true;

        visited[x][y] = true;
        for (int[] dir : dirs) {
            int newX = x + dir[0];
            int newY = y + dir[1];
            dfs(grid, newX, newY, visited);
        }
    }
}