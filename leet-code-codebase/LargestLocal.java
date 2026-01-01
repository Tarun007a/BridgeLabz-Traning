// leetcode 2373
class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] result = new int[n-2][m-2];
        for(int i = 0; i < n-2; i++){
            for(int j = 0; j < m-2; j++){
                int max = -1;
                for(int row = -1; row <= 1; row++){
                    for(int col = -1; col <= 1; col++){
                        max = Math.max(max, grid[i+row+1][j+col+1]);
                    }
                }
                result[i][j] = max;
            }
        }
        return result;
    }
}