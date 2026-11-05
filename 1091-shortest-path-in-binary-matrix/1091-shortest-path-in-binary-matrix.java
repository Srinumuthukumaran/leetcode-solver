class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;

        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
            return -1;
        }    

        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[n][n];

        queue.offer(new int[]{0,0});
        visited[0][0] = true;

        int distance = 1;

        int[] dr = {-1,-1,-1,0,0,1,1,1};
        int[] dc = {-1,0,1,-1,1,-1,0,1};

        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0;i<size;i++){
                int[] cur = queue.poll();

                int r = cur[0];
                int c = cur[1];

                if(r==n-1 && c== n-1){
                    return distance;
                }

                for(int k=0;k<8;k++){
                    int nr = r+dr[k];
                    int nc = c+dc[k];

                    if(nr>=0 && nr<n && nc>=0 && nc<n && 
                    grid[nr][nc] == 0 && !visited[nr][nc]){
                        visited[nr][nc] = true;
                        queue.offer(new int[]{nr,nc});
                    }
                }
            }
            distance++;
        }
        return -1;
    }
}