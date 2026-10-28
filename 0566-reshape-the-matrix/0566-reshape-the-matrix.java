class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        int original = m*n;
        int required = r*c;

        if(original != required){
            return mat;
        }

        int[][] result = new int[r][c];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int index = i*n+j;

                int newRow = index/c;
                int newCol = index%c;

                result[newRow][newCol] = mat[i][j];

            }
        }
        return result;
    }
}