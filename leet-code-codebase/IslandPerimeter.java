// leetcode - 463
class Solution {
    public int islandPerimeter(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        int[] delRow = {-1,0,1,0};
        int[] delCol = {0,1,0,-1};
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 0)continue;

                for(int k = 0; k < 4; k++){
                    int row = i+delRow[k];
                    int col = j+delCol[k];
                    if(row >= 0 && row < n && col >= 0 && col < m && grid[row][col] == 1)continue;
                    ans++;
                }
            }
        }
        return ans;
    }
}