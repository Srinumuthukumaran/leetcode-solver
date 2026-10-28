class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows*cols;

        k = k%total;

        List<List<Integer>> result = new ArrayList<>();

        for(int i=0;i<rows;i++){
            List<Integer> row = new ArrayList<>();

            for(int j=0;j<cols;j++){
                row.add(0);
            }
            result.add(row);
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                int index = i*cols+j;

                int newindex = (index+k) % total;

                int newRow = newindex/cols;
                int newCol = newindex%cols;

                result.get(newRow).set(newCol,grid[i][j]);
            }
        }
        return result;
    }
}