package Day3;

public class Number_of_Islands {
    public static void isIsland(char[][] grid, int i, int j) {
        int n = grid.length;
        int m = grid[0].length;
        if(i >= 0 && j >= 0 && i < n && j < m && grid[i][j] == '1'){
            grid[i][j] = '0';
            isIsland(grid, i, j-1);
            isIsland(grid, i, j+1);
            isIsland(grid, i-1, j);
            isIsland(grid, i+1, j);
        }
        return;
    }
    public static int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    isIsland(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        char[][] grid = {
                        {'1','1','1','1','0'},
                        {'1','1','0','1','0'},
                        {'1','1','0','0','0'},
                        {'0','0','0','0','0'}
                    };
        System.out.println(numIslands(grid));
    }
}
