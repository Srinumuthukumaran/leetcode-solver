class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
                map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int count : map.values()){
            if(count == 2 || count ==3 || count ==5 || count ==7){
                return true;
            }
            if(count == 1 || count%2 == 0 || count%3 == 0 || count%5 ==0|| count%7==0){
                continue;
            }
            return true;
        }
        return false;
    }
}