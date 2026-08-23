class Solution {
    public int characterReplacement(String s, int k) {
        int[] ans = new int[26];

        int left = 0;
        int maxcount = 0;
        int maxlen = 0;


        for(int right = 0;right<s.length();right++){
            char ch = s.charAt(right);
            ans[ch - 'A']++;

            maxcount = Math.max(maxcount,ans[ch - 'A']);

            while((right - left + 1) - maxcount > k){
                ans[s.charAt(left) - 'A']--;
                left++;
            }

            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}