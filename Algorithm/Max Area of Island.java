class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i ++){
            for (int j = 0; j < grid[0].length; j ++){
                if (grid[i][j] == 1){
                    int area = getArea(grid, i, j);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
    
    private int getArea(int[][] grid, int i, int j){
        if (i >= 0 && i < grid.length && j >= 0 && j < grid[0].length && grid[i][j] == 1){
            grid[i][j] = 0;
            return getArea(grid, i + 1, j) + 
                   getArea(grid, i - 1, j) + 
                   getArea(grid, i, j - 1) + 
                   getArea(grid, i, j + 1) + 1;
        }
        return 0;
    }

}
