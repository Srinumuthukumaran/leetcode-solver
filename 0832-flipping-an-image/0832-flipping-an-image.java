class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        for(int i=0;i<image.length;i++){
            int[] row = image[i];

            int left = 0;
            int right = row.length-1;

            while(left<=right){
                int temp = row[left];
                row[left] = 1-row[right];
                row[right] = 1-temp;
                left++;
                right--;
            }
        }
        return image;
    }
}