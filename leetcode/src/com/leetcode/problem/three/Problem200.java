package com.leetcode.problem.three;

/**
 * Number of Islands
 * @author ln
 *
 */
public class Problem200 {
	private int m;
  private int n;
  public int numIslands(char[][] grid) {
      int count = 0;
      m = grid.length;
      if(m==0) return 0;
      n = grid[0].length;
      for(int i=0; i<m; i++){
          for(int j=0; j<n; j++){
          	if(grid[i][j] == '1'){
              dfs(grid, i ,j);
              count++;
          	}
          }
      }
      return count;
  }
  
  public void dfs(char[][] grid, int i, int j){
    	if(i<0 || j<0 || i>= m || j>=n || grid[i][j]!='1') return;
      grid[i][j] = '0';
      dfs(grid, i-1, j);
      dfs(grid, i+1, j);
      dfs(grid, i, j-1);
      dfs(grid, i, j+1);
  }
}
