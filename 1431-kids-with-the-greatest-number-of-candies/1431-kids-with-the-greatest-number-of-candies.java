class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxcandies = 0;

        for(int candy : candies){
            maxcandies = Math.max(candy,maxcandies);
        }
        List<Boolean> res = new ArrayList<>();

        for(int candy : candies){
            if(candy + extraCandies >= maxcandies){
                res.add(true);
            }
            else{
                res.add(false);
            }
        }
        return res;
    }
}