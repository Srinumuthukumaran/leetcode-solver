class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        int fresh = 0;
        int minutes = 0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 2){
                    queue.offer(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int[] dr = {-1,1,0,0};
        int[] dc = {0,0,-1,1};

        while(!queue.isEmpty() && fresh > 0){
            int size = queue.size();

            for(int i=0;i<size;i++){
                int[] current = queue.poll();

                int r = current[0];
                int c = current[1];

                for(int k=0;k<4;k++){
                    int nr = r + dr[k];
                    int nc = c + dc[k];

                    if(nr>=0 && nr<grid.length && nc>=0 && nc<grid[0].length && 
                        grid[nr][nc]== 1 ){
                            grid[nr][nc] = 2;
                            fresh--;
                            queue.offer(new int[]{nr,nc});
                    }
                }
            }
            minutes++;
        }
        if(fresh > 0){
            return -1;
        }
        return minutes;
    }
}