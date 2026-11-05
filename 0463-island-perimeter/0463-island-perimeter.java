class Solution {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;

        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 0){
                    continue;
                }

                for(int k=0;k<4;k++){
                    int nr = i + dr[k];
                    int nc = j + dc[k];

                    if(nr < 0 || nr>=grid.length || nc<0 || nc>=grid[0].length || 
                    grid[nr][nc] == 0){
                        perimeter++;
                    } 

                }
            }
        }
        return perimeter;
    }
}