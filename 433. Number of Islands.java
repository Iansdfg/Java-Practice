public class Coordinate {
    int x, y 
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
}

public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        // write your code here
        if(grid == null || grid.length == 0 || grid[0].length == 0){
            return 0;
        }
        
        int n = grid.length;
        int m = grid[0].length;
        int islands = 0;
        
        for(int i = 0; i<n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j]){
                    markByBFS(grid, i, j);
                    islands++;
                }
            }
        }
        return islandsll
    }
    
    private void markByBFS(boolean[][] grid, int x, int y){
        
    }
    
    
}
