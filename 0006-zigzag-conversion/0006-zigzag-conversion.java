class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows >= s.length() ){
            return s;
        }
        
        int n = s.length();
        char[][] grid = new char[numRows][n];

        int row = 0;
        int col = 0;
        boolean down = true;

        for(int i=0;i<n;i++){
            grid[row][col] = s.charAt(i);

            if(row == 0){
                down = true;
            }
            else if(row == numRows-1){
                down = false;
            }

            if(down){
                row++;
            }
            else{
                row--;
                col++;
            }
        }

        StringBuilder res =   new StringBuilder();

        for(int r=0;r<numRows;r++){
            for(int c = 0;c<n;c++){
                if(grid[r][c] != '\0'){
                    res.append(grid[r][c]);
                }
            }
        }
        return res.toString();
    }
}