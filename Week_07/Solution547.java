/**
 * 
 * [547] Friend Circles
 */
class Solution {
    public int findCircleNum(int[][] M) {
        int res = 0;
        boolean[] visited = new boolean[M.length];
        for (int i = 0;i < M.length;i++) {
            if (!visited[i]) {
                res++;
                dfs(M, visited, i);
            }
        }
        return res;
    }
    
    private void dfs(int[][] M, boolean[] visited, int index) {
        visited[index] = true;
        
        for (int i = 0;i < M.length;i++) {
            if (i == index) {
                continue;
            }
            if (M[i][index] == 1 && !visited[i]) {
                dfs(M, visited, i);
            }
        }
    }
}