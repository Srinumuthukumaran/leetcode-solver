class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int sum =nums[0]+nums[1]+nums[2];
        
        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;

            while(left < right){
                int close = nums[i]+nums[left]+nums[right];

                if(Math.abs(target - close) < Math.abs(target - sum)){
                    sum = close;
                }
                if(close == target){
                    return target;
                }
                else if(close < target){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return sum;
    }
}