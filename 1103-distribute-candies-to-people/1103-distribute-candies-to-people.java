class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int give = 1;
        int i=0;

        while(candies > 0){
            int actual = Math.min(candies,give);
            result[i]+=actual;
            candies -= actual;
            give++;
            i = (i+1)%num_people;

        }
        return result;
    }
}