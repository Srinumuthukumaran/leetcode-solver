class Solution {
    private boolean palin(String s,int left,int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public int maxPalindromes(String s, int k) {
        int n = s.length();
        int count = 0;
        int last=0;

        for(int right = k-1;right<n;right++){
            int left = right - k + 1;

            boolean add = (left >= last && palin(s,left,right)) || (left > last && palin(s,left-1,right));

            if(add){
                count++;
                last = right + 1;
            }
        }
        return count;
    }
}